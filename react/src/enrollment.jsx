import { enrollments } from "./data";
import { useState } from "react";

export default function EnrollmentsList(){

    const [enrollment, setEnrollment] = useState([]);

    const showEnrollments = () => {
      setEnrollment(enrollments);
    
    }


    return(
      <>
        <h2> Enrollments </h2>

        <div>
        <button onClick = {showEnrollments}>
        Show 
        </button>

        {enrollment.map((enroll1) => (
        <div key={enroll1.id}>
        <p>Id: {enroll1.id}</p>
        <p>Teacher: {enroll1.teacher}</p>
        <p>Student: {enroll1.student}</p>
        <p>Subject: {enroll1.subject}</p>
        <p>Date:{enroll1.date}</p>
        <hr />
        
        </div>
        ))}
        </div>

      </>
  );
}
