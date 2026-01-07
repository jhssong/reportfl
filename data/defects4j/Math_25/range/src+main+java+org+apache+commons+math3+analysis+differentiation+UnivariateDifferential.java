{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/analysis/differentiation/UnivariateDifferential.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateDifferential",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 61,
      "comment": " Interface for univariate functions derivatives.\n * \u003cp\u003eThis interface represents a simple function which computes\n * both the value and the first derivative of a mathematical function.\n * The derivative is computed with respect to the input variable.\u003c/p\u003e\n * @see UnivariateDifferentiable\n * @see UnivariateDifferentiator\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.UnivariateDifferential.getPrimitive()",
      "begin_line": 51,
      "end_line": 51,
      "comment": " Get the primitive function associated with this differential.\n     * \u003cp\u003eEach {@link UnivariateDifferential} instance is tightly bound\n     * to an {@link UnivariateDifferentiable} instance. If the state of\n     * the primitive instance changes in any way that affects the\n     * differential computation, this binding allows this change to\n     * be immediately seen by the derivative instance, there is no need\n     * to differentiate the primitive again. The existing instance is aware\n     * of the primitive changes.\u003c/p\u003e\n     * \u003cp\u003eIn other words in the following code snippet, the three values\n     * f1, f2 and f3 should be equal (at least at machine tolerance level)\u003c/p\u003e\n     * \u003cpre\u003e\n     *    UnivariateDifferential derivative \u003d differentiator.differentiate(derivable);\n     *    derivable.someFunctionThatMutatesHeavilyTheInstance();\n     *    double f1 \u003d derivable.f(t);\n     *    double f2 \u003d derivative.getPrimitive().f(t);\n     *    double f3 \u003d derivative.f(new DerivativeStructure(variables, order, index, t)).getValue();\n     * \u003c/pre\u003e\n     * @return primitive function bound to this derivative\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.UnivariateDifferential.f(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 59,
      "end_line": 59,
      "comment": " Simple mathematical function.\n     * \u003cp\u003e{@link UnivariateDifferential} classes compute both the\n     * value and the first derivative of the function.\u003c/p\u003e\n     * @param t function input value\n     * @return function result\n     ",
      "child_ranges": []
    }
  ]
}