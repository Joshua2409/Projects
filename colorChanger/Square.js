import { useState } from "react"
import './Square.css' 

const Square = ({colorValue}) => {
  const [generateColor, setGenerateColor] = useState()
  const [colorHistory, setColorHistory] = useState([])
  const [textColor, setTextColor] = useState(['black'])

  const handleClick = () =>{
      var number = "0123456789ABCDEF";
      var color = "#";
      for( var i = 0; i <6; i++){
          color += number[Math.floor(Math.random()*16)]
      }
      setGenerateColor(color)
      setColorHistory(prevColorHistory =>[color,...prevColorHistory].slice(0,5))
      setTextColor('white')

      }
  
  const textStyle ={color : setTextColor,}

  return (

        <section>
                <div className="boxColor" style={{backgroundColor : generateColor}}>
                  <p style={textStyle}>{generateColor? generateColor :'No Color Here'}</p>
                </div>

                <button onClick={handleClick}>Generate a color</button>

                <ul> Previous Colors
        {colorHistory.map((generateColor, index) => (
          <li className="history" style={{ backgroundColor: generateColor, listStyleType: "none", border: "1px solid black"}}>
            {generateColor}
          </li>
        ))}
      </ul>
        </section>
  )
}

Square.defaultProps = {
    colorValue : "empty value"
}

export default Square
