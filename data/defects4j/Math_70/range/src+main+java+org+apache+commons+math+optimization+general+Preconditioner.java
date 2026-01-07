{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/general/Preconditioner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Preconditioner",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 52,
      "comment": "\n * This interface represents a preconditioner for differentiable scalar\n * objective function optimizers.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.Preconditioner.precondition(double[], double[])",
      "begin_line": 49,
      "end_line": 50,
      "comment": "\n     * Precondition a search direction.\n     * \u003cp\u003e\n     * The returned preconditioned search direction must be computed fast or\n     * the algorithm performances will drop drastically. A classical approach\n     * is to compute only the diagonal elements of the hessian and to divide\n     * the raw search direction by these elements if they are all positive.\n     * If at least one of them is negative, it is safer to return a clone of\n     * the raw search direction as if the hessian was the identity matrix. The\n     * rationale for this simplified choice is that a negative diagonal element\n     * means the current point is far from the optimum and preconditioning will\n     * not be efficient anyway in this case.\n     * \u003c/p\u003e\n     * @param point current point at which the search direction was computed\n     * @param r raw search direction (i.e. opposite of the gradient)\n     * @return approximation of H\u003csup\u003e-1\u003c/sup\u003er where H is the objective function hessian\n     * @exception FunctionEvaluationException if no cost can be computed for the parameters\n     * @exception IllegalArgumentException if point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}