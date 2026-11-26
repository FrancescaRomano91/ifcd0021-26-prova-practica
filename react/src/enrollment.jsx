import { enrollments } from "./data";
import { useState } from "react";

export default function EnrollmentsList(){

    const [enrollment, setEnrollment] = useState([]);

    const showEnrollments = () => {
      setEnrollment(enrollment);
    
    }


    return(
      <>
        <h2> Enrollments </h2>

        <div>
        <button onClick = {showEnrollments}>
        Show 
        </button>

        {enrollment.map((enroll1) => (
        <div key={enrollment.id}>
        <p>Id: {enrollment.id}</p>
        </div>
        ))}
        </div>

      </>
  );
}
