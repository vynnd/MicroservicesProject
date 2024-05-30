import React, { Component, useEffect, useState } from 'react';
import EmployeeService from '../service/EmployeeService';
// import EmployeeService from '../service/EmployeeService';

// class EmployeeComponent extends Component {

//     constructor(props){
//         super(props);

//         this.state = {
//             employee: {},
//             department: {},
//             organization: {}
//         }
//     }

//     componentDidMount(){
//         EmployeeService.getEmployee().then((response) => {
//             this.setState({employee : response.data.employee})
//             this.setState({department : response.data.department})
//             this.setState({organization : response.data.organization})
//         })

//         console.log(this.state.employee)
//         console.log(this.state.department)
//         console.log(this.state.organization)
//     }

//     render() {
//         return (
//             <div>
                
//             </div>
//         );
//     }
// }

// export default EmployeeComponent;

export const EmployeeComponent = () => {

    const [employee, setEmployee] = useState({})
    const [department, setDepartment] = useState({})
    const [organization, setOrganization] = useState({})
    
    useEffect(() => {
        EmployeeService.getEmployee().then((res) => {
            setEmployee(res.data.employee)
            setDepartment(res.data.department)
            setOrganization(res.data.organization)
        })
    }, [])
    return(
        <div>
            <div className='card offset-md-3'>
                <h3 className='text-center card-header'>View Employee Detail</h3>
                <div className='card-body'>
                    <div className='row'>
                        <p><strong>Employee First Name: </strong>{employee.firstName} </p>
                    </div>
                    <div className='row'>
                        <p><strong>Employee Last Name: </strong>{employee.lastName} </p>
                    </div>
                    <div className='row'>
                        <p><strong>Employee Email: </strong>{employee.email} </p>
                    </div>
                </div>

                <br/>
                <br/>

                <h3 className='text-center card-header'>View Department Detail</h3>
                <div className='card-body'>
                    <div className='row'>
                        <p><strong>Department Name: </strong>{department.departmentName} </p>
                    </div>
                    <div className='row'>
                        <p><strong>Department Description: </strong>{department.departmentDescription} </p>
                    </div>
                    <div className='row'>
                        <p><strong>Department Code: </strong>{department.departmentCode} </p>
                    </div>
                </div>

                <br/>
                <br/>

                <h3 className='text-center card-header'>View Organization Detail</h3>
                <div className='card-body'>
                    <div className='row'>
                        <p><strong>Organization Name: </strong>{organization.organizationName} </p>
                    </div>
                    <div className='row'>
                        <p><strong>Organization Description: </strong>{organization.organizationDescription} </p>
                    </div>
                    <div className='row'>
                        <p><strong>Organization Code: </strong>{organization.organizationCode} </p>
                    </div>
                </div>

            </div>
        </div>
    )
}