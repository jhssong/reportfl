{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/UniformRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.NormalizedRandomGenerator"
      ],
      "begin_line": 34,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SQRT3"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Square root of three. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Underlying generator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.UniformRandomGenerator.UniformRandomGenerator(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 45,
      "end_line": 47,
      "comment": " Create a new generator.\n     * @param generator underlying random generator to use\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.UniformRandomGenerator.nextNormalizedDouble()",
      "begin_line": 54,
      "end_line": 56,
      "comment": " Generate a random scalar with null mean and unit standard deviation.\n     * \u003cp\u003eThe number generated is uniformly distributed between -\u0026sqrt;(3)\n     * and +\u0026sqrt;(3).\u003c/p\u003e\n     * @return a random scalar with null mean and unit standard deviation\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 58)"
      ]
    }
  ]
}