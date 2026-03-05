function validarContrasena (contrasena) {
if (contrasena.length < 8) {
return false;
}
if (!/[A-Z]/.test(contrasena)){
return false;
}
return true;
}

console.log(validarContrasena("Antonio25"));