package steps

import io.cucumber.scala.{EN, ScalaDsl}

class StepDefinitions extends ScalaDsl with EN {
	Given("""a chicken collects {int} insects per minute""") { (int1: Int) =>
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.scala.PendingException()
	}
	When("""chicken has searched insects for {int} minutes""") { (int1: Int) =>
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.scala.PendingException()
	}
	Then("""the chicken has found {int} insects""") { (int1: Int) =>
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.scala.PendingException()
	}

}
