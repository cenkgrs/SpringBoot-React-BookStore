import './App.css'
import { Link, Route, Switch } from 'react-router-dom';
import Home from './components/Home';
import Converter from './components/Converter';

function App() {
  return (
    <div className="App">
      <nav>
        <div className="menu">
          <Link to="/">Home</Link>
          <Link to="/converter">Converter</Link>
        </div>
      </nav>
      <Switch>
      <Route exact path="/" component={Home} />
        <Route path="/converter" component={Converter} />

      </Switch>
    </div>
  )
}

export default App