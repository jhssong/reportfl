{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/linear/LinearOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearOptimizer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 89,
      "comment": "\n * This interface represents an optimization algorithm for linear problems.\n * \u003cp\u003eOptimization algorithms find the input point set that either {@link GoalType\n * maximize or minimize} an objective function. In the linear case the form of\n * the function is restricted to\n * \u003cpre\u003e\n * c\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\n * \u003c/pre\u003e\n * and there may be linear constraints too, of one of the forms:\n * \u003cul\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u0026lt;\u003d v\u003c/li\u003e\n *   \u003cli\u003ec\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... c\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e \u003e\u003d v\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u0026lt;\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003el\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... l\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + l\u003csub\u003ecst\u003c/sub\u003e \u003e\u003d\n *       r\u003csub\u003e1\u003c/sub\u003ex\u003csub\u003e1\u003c/sub\u003e + ... r\u003csub\u003en\u003c/sub\u003ex\u003csub\u003en\u003c/sub\u003e + r\u003csub\u003ecst\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * where the c\u003csub\u003ei\u003c/sub\u003e, l\u003csub\u003ei\u003c/sub\u003e or r\u003csub\u003ei\u003c/sub\u003e are the coefficients of\n * the constraints, the x\u003csub\u003ei\u003c/sub\u003e are the coordinates of the current point and\n * v is the value of the constraint.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearOptimizer.setMaxIterations(int)",
      "begin_line": 58,
      "end_line": 58,
      "comment": " Set the maximal number of iterations of the algorithm.\n     * @param maxIterations maximal number of function calls\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearOptimizer.getMaxIterations()",
      "begin_line": 63,
      "end_line": 63,
      "comment": " Get the maximal number of iterations of the algorithm.\n     * @return maximal number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearOptimizer.getIterations()",
      "begin_line": 73,
      "end_line": 73,
      "comment": " Get the number of iterations realized by the algorithm.\n     * \u003cp\u003e\n     * The number of evaluations corresponds to the last call to the\n     * {@link #optimize(LinearObjectiveFunction, Collection, GoalType, boolean) optimize}\n     * method. It is 0 if the method has not been called yet.\n     * \u003c/p\u003e\n     * @return number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.LinearOptimizer.optimize(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean)",
      "begin_line": 85,
      "end_line": 87,
      "comment": " Optimizes an objective function.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @return point/value pair giving the optimal value for objective function\n     * @exception OptimizationException if no solution fulfilling the constraints\n     * can be found in the allowed number of iterations\n     ",
      "child_ranges": []
    }
  ]
}