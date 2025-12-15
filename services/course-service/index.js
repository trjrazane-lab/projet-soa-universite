const express = require("express");
const cors = require("cors");

const app = express();
app.use(cors());

const courses = [
  { id: 1, name: "Mathématiques" },
  { id: 2, name: "Informatique" },
  { id: 3, name: "Réseaux" }
];

app.get("/courses", (req, res) => {
  res.json(courses);
});

const PORT = 3001;
app.listen(PORT, () => {
  console.log(`Course Service running on port ${PORT}`);
});
