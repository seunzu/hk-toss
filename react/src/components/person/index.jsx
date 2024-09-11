import { useState } from "react";

const init = {name: "", age: 0};
const Person = () => {
    const [person, setPerson] = useState({...init});
    const [people, setPeople] = useState([]);
    const [search, setSearch] = useState("");
    const onChangePerson = (e) => {
        const {name, value} = e.target;
        setPerson({...person, [name]: value});
    }
    const onSubmit = () => {
        setPerson({...init})
        setPeople([...people, {...person}])
    }
    return <div>
        <input 
            name="name" 
            value={person.name} 
            onChange={onChangePerson}/>
        <input name="age" value={person.age} onChange={onChangePerson}/>
        <button onClick={onSubmit}>등록</button>
        <br/>
        <input onChange={(e)=> setSearch(e.target.value)}/>
        <table border={1}>
            <thead>
                <th>name</th>
                <th>age</th>
            </thead>
            {people
                .filter(({name})=> name.includes(search))
                .map(({name, age})=> <tr><td>{name}</td><td>{age}</td></tr>)}
        </table>
    </div>
}

export default Person;