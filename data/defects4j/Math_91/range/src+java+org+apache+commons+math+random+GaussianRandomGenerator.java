{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/random/GaussianRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.NormalizedRandomGenerator"
      ],
      "begin_line": 28,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.GaussianRandomGenerator.GaussianRandomGenerator(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 36,
      "end_line": 38,
      "comment": " Create a new generator.\n     * @param generator underlying random generator to use\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.GaussianRandomGenerator.nextNormalizedDouble()",
      "begin_line": 43,
      "end_line": 45,
      "comment": " Generate a random scalar with null mean and unit standard deviation.\n     * @return a random scalar with null mean and unit standard deviation\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Underlying generator. "
    }
  ]
}