package strategyPattern.ducks

import strategyPattern.fly.NoFly
import strategyPattern.squawk.NoSquawk
import strategyPattern.fly.NormalFly
import strategyPattern.squawk.NormalSquawk

class WildDuck : DuckImpl(NormalSquawk(), NormalFly())
class RubberDuck : DuckImpl(NormalSquawk(), NoFly())
class DuckDecoy : DuckImpl(NoSquawk(), NormalFly())