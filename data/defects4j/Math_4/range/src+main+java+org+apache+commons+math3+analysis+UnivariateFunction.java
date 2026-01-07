{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/UnivariateFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateFunction",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 68,
      "end_line": 82,
      "comment": "\n * An interface representing a univariate real function.\n * \u003cbr/\u003e\n * When a \u003cem\u003euser-defined\u003c/em\u003e function encounters an error during\n * evaluation, the {@link #value(double) value} method should throw a\n * \u003cem\u003euser-defined\u003c/em\u003e unchecked exception.\n * \u003cbr/\u003e\n * The following code excerpt shows the recommended way to do that using\n * a root solver as an example, but the same construct is applicable to\n * ODE integrators or optimizers.\n *\n * \u003cpre\u003e\n * private static class LocalException extends RuntimeException {\n *     // The x value that caused the problem.\n *     private final double x;\n *\n *     public LocalException(double x) {\n *         this.x \u003d x;\n *     }\n *\n *     public double getX() {\n *         return x;\n *     }\n * }\n *\n * private static class MyFunction implements UnivariateFunction {\n *     public double value(double x) {\n *         double y \u003d hugeFormula(x);\n *         if (somethingBadHappens) {\n *           throw new LocalException(x);\n *         }\n *         return y;\n *     }\n * }\n *\n * public void compute() {\n *     try {\n *         solver.solve(maxEval, new MyFunction(a, b, c), min, max);\n *     } catch (LocalException le) {\n *         // Retrieve the x value.\n *     }\n * }\n * \u003c/pre\u003e\n *\n * As shown, the exception is local to the user\u0027s code and it is guaranteed\n * that Apache Commons Math will not catch it.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.UnivariateFunction.value(double)",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Compute the value of the function.\n     *\n     * @param x Point at which the function value should be computed.\n     * @return the value of the function.\n     * @throws IllegalArgumentException when the activated method itself can\n     * ascertain that a precondition, specified in the API expressed at the\n     * level of the activated method, has been violated.\n     * When Commons Math throws an {@code IllegalArgumentException}, it is\n     * usually the consequence of checking the actual parameters passed to\n     * the method.\n     ",
      "child_ranges": []
    }
  ]
}