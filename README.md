# Fecha
# Herencia
Supongamos que no tenemos acceso al código de la clase Fecha. Es decir, podemos utilizarla pero no la podemos modificar porque fue hecha por terceras partes. Hagamos de cuenta que no la desarrollamos nosotros. Deste modo, supongamos que, aunque la clase Fecha nos resulta útil, funciona bien y es muy práctica, queremos modificar la forma en que una fecha se representa a si misma cuando icvocamos a su método toString.

La solución es crear una nueva clase (FechaDetallada) que hereda de Fecha y que modifique la manera que esta se representa como cadena.
Ejemplo: 19 de noviembre de 2022.