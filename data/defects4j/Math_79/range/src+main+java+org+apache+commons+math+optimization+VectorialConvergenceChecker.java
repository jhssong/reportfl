{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/VectorialConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorialConvergenceChecker",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.VectorialConvergenceChecker.converged(int, org.apache.commons.math.optimization.VectorialPointValuePair, org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 53,
      "end_line": 53,
      "comment": " Check if the optimization algorithm has converged considering the last points.\n   * \u003cp\u003e\n   * This method may be called several time from the same algorithm iteration with\n   * different points. This can be detected by checking the iteration number at each\n   * call if needed. Each time this method is called, the previous and current point\n   * correspond to points with the same role at each iteration, so they can be\n   * compared. As an example, simplex-based algorithms call this method for all\n   * points of the simplex, not only for the best or worst ones.\n   * \u003c/p\u003e\n   * @param iteration index of current iteration\n   * @param previous point from previous iteration\n   * @param current point from current iteration\n   * @return true if the algorithm is considered to have converged\n   ",
      "child_ranges": []
    }
  ]
}