/* ******************************************************************
 * ILP -- Implantation d'un langage de programmation.
 * Copyright (C) 2004 <Christian.Queinnec@lip6.fr>
 * $Id:AbstractInvokable.java 405 2006-09-13 17:21:53Z queinnec $
 * GPL version>=2
 * ******************************************************************/

package fr.upmc.ilp.ilp1.runtime;

/** Une classe abstraite de fonction qui peut servir de base à des
 * implantations particulières. Il suffit, si la fonction a moins de
 * quatre arguments, de définir la méthode invoke appropriée.
 * @see fr.upmc.ilp.ilp1.runtime.PrintStuff
 */

public abstract class AbstractInvokableImpl
  implements Invokable {

  private static final String WRONG_ARITY =
    "Wrong arity";

  /** Une fonction invoquée avec un nombre quelconque d'arguments. Les
   * petites arités sont renvoyées sur les méthodes appropriées. */

  public Object invoke (final Object[] arguments)
    throws EvaluationException {
    switch (arguments.length) {
    case 0: return this.invoke();
    case 1: return this.invoke(arguments[0]);
    case 2: return this.invoke(arguments[0], arguments[1]);
    case 3: return this.invoke(arguments[0], arguments[1], arguments[2]);
    default: throw new EvaluationException(WRONG_ARITY);
    }
  }

  /** Invocation d'une fonction zéro-aire (ou niladique) */

  public Object invoke ()
    throws EvaluationException {
    throw new EvaluationException(WRONG_ARITY);
  }

  /** Invocation d'une fonction unaire (ou monadique) */

  public Object invoke (final Object argument1)
    throws EvaluationException {
    throw new EvaluationException(WRONG_ARITY);
  }

  /** Invocation d'une fonction binaire (ou dyadique) */

  public Object invoke (final Object argument1,
                        final Object argument2)
    throws EvaluationException {
    throw new EvaluationException(WRONG_ARITY);
  }

  /** Invocation d'une fonction ternaire */

  public Object invoke (final Object argument1,
                        final Object argument2,
                        final Object argument3)
    throws EvaluationException {
    throw new EvaluationException(WRONG_ARITY);
  }

}

// end of AbstractInvokableImpl.java
