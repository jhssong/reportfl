{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/random/UncorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UncorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 31,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.UncorrelatedRandomVectorGenerator(double[], double[], org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 45,
      "end_line": 54,
      "comment": " Simple constructor.\n   * \u003cp\u003eBuild an uncorrelated random vector generator from\n   * its mean and standard deviation vectors.\u003c/p\u003e\n   * @param mean expected mean values for each component\n   * @param standardDeviation standard deviation for each component\n   * @param generator underlying generator for uncorrelated normalized\n   * components\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 50,col 5)",
        "(line 51,col 5)-(line 51,col 42)",
        "(line 52,col 5)-(line 52,col 55)",
        "(line 53,col 5)-(line 53,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.UncorrelatedRandomVectorGenerator(int, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 63,
      "end_line": 69,
      "comment": " Simple constructor.\n   * \u003cp\u003eBuild a null mean random and unit standard deviation\n   * uncorrelated vector generator\u003c/p\u003e\n   * @param dimension dimension of the vectors to generate\n   * @param generator underlying generator for uncorrelated normalized\n   * components\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 46)",
        "(line 66,col 5)-(line 66,col 46)",
        "(line 67,col 5)-(line 67,col 40)",
        "(line 68,col 5)-(line 68,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 74,
      "end_line": 83,
      "comment": " Generate an uncorrelated random vector.\n   * @return a random vector as a newly built array of double\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 46)",
        "(line 77,col 5)-(line 79,col 5)",
        "(line 81,col 5)-(line 81,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Standard deviation vector. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Underlying scalar generator. "
    }
  ]
}