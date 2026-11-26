import { enrollments } from './data.js'
import EnrollmentsList from './enrollment.jsx'



// TODO (MF05): mostreu l'array `enrollments` importat de data.js.
// Feu servir useState i un esdeveniment (per exemple, filtrar per professor
// o marcar una matrícula com a seleccionada).
// NO feu fetch ni crideu l'API del backend.

function App() {
  return (
    <main>
      <h1>Matrícules</h1>
      <EnrollmentsList />
    </main>
  )
}

export default App
