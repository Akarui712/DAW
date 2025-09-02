const express = require('express');
const app = express();

app.get('/api/hello', (req, res) => 
{
    res.json({message: "Hola Mundo, soy Fernanda!!"});
});

app.listen(3000, () => console.log('listening on :3000'));

// Consultar --> http://localhost:3000/api/hello