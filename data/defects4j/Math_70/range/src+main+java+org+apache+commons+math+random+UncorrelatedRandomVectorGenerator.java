{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/random/UncorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UncorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 33,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Underlying scalar generator. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Standard deviation vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.UncorrelatedRandomVectorGenerator(double[], double[], org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 53,
      "end_line": 64,
      "comment": " Simple constructor.\n   * \u003cp\u003eBuild an uncorrelated random vector generator from\n   * its mean and standard deviation vectors.\u003c/p\u003e\n   * @param mean expected mean values for each component\n   * @param standardDeviation standard deviation for each component\n   * @param generator underlying generator for uncorrelated normalized\n   * components\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 60,col 5)",
        "(line 61,col 5)-(line 61,col 42)",
        "(line 62,col 5)-(line 62,col 55)",
        "(line 63,col 5)-(line 63,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.UncorrelatedRandomVectorGenerator(int, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 73,
      "end_line": 79,
      "comment": " Simple constructor.\n   * \u003cp\u003eBuild a null mean random and unit standard deviation\n   * uncorrelated vector generator\u003c/p\u003e\n   * @param dimension dimension of the vectors to generate\n   * @param generator underlying generator for uncorrelated normalized\n   * components\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 46)",
        "(line 76,col 5)-(line 76,col 46)",
        "(line 77,col 5)-(line 77,col 40)",
        "(line 78,col 5)-(line 78,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 84,
      "end_line": 93,
      "comment": " Generate an uncorrelated random vector.\n   * @return a random vector as a newly built array of double\n   ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 46)",
        "(line 87,col 5)-(line 89,col 5)",
        "(line 91,col 5)-(line 91,col 18)"
      ]
    }
  ]
}