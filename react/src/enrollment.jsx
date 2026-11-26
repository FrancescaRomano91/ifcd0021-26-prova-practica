import { enrollments } from "./data";
import { useState } from "react";

export default function EnrollmentList(){

    [enrollments, setEnrollment] = useState([]);

    const showEnrollments(){
      setEnrollment{enrollments};
    
    }


    return (
        
        <>
          <h2> Enrollments </h2>

          <div>
            <button onClick = {showEnrollments}>
            Show 
            </button>

            {enrollmentList.map((enrollment) => (
                <div key={enrollment.id}>
                  <p>Id: {enrollment.id}</p>
                </div>
            ))}
        </>
    );
}
