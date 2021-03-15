# ICS0014 Project 2 - Team 2 ppTable
## Developed by 
* Kristiina Šamanina 210732IVSB (krsama@taltech.ee), 
* Mihkel Kiil 201748IVSB (mikiil@taltech.ee) and 
* Edvin Ess 201739IVSB (edvess@taltech.ee)

Start Application in CalculatorApplication.java  
Application runs at: http://localhost:8080  
Swagger UI is accessible: http://localhost:8080/swagger-ui/index.html

## Examples
`/calculator/calculate1?input=1,2,3,4`

returns
````
{
    "maxEven":4,
    "minOdd":1,
    "even":[2,4]
}
````

`/calculator/calculate2?input=-1,3,-6,8`

returns
````
{
    "maxEven":8,
    "squared":[1,9,36,64],
    "averageOfPositives":5.5
}
````


