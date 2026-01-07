{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/optimization/PointCostPair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PointCostPair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 59,
      "comment": " \n * This class holds a point and its associated cost.\n * \u003cp\u003eThis is a simple immutable container.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @see CostFunction\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.PointCostPair.PointCostPair(double[], double)",
      "begin_line": 34,
      "end_line": 37,
      "comment": " Build a point/cost pair.\n   * @param point point coordinates (the built instance will store\n   * a copy of the array, not the array passed as argument)\n   * @param cost point cost\n   ",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 42)",
        "(line 36,col 5)-(line 36,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.PointCostPair.getPoint()",
      "begin_line": 42,
      "end_line": 44,
      "comment": " Get the point.\n   * @return a copy of the stored point\n   ",
      "child_ranges": [
        "(line 43,col 7)-(line 43,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.PointCostPair.getCost()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Get the cost.\n   * @return the stored cost\n   ",
      "child_ranges": [
        "(line 50,col 7)-(line 50,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Point coordinates. "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Cost associated to the point. "
    }
  ]
}