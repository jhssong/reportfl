{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/random/UncorrelatedRandomVectorGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UncorrelatedRandomVectorGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomVectorGenerator"
      ],
      "begin_line": 30,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.UncorrelatedRandomVectorGenerator(double[], double[], org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 41,
      "end_line": 50,
      "comment": " Simple constructor.\n   * \u003cp\u003eBuild an uncorrelated random vector generator from\n   * its mean and standard deviation vectors.\u003c/p\u003e\n   * @param mean expected mean values for each component\n   * @param standardDeviation standard deviation for each component\n   * @param generator underlying generator for uncorrelated normalized\n   * components\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 46,col 5)",
        "(line 47,col 5)-(line 47,col 53)",
        "(line 48,col 5)-(line 48,col 66)",
        "(line 49,col 5)-(line 49,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.UncorrelatedRandomVectorGenerator(int, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 59,
      "end_line": 65,
      "comment": " Simple constructor.\n   * \u003cp\u003eBuild a null mean random and unit standard deviation\n   * uncorrelated vector generator\u003c/p\u003e\n   * @param dimension dimension of the vectors to generate\n   * @param generator underlying generator for uncorrelated normalized\n   * components\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 46)",
        "(line 62,col 5)-(line 62,col 46)",
        "(line 63,col 5)-(line 63,col 40)",
        "(line 64,col 5)-(line 64,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 70,
      "end_line": 79,
      "comment": " Generate an uncorrelated random vector.\n   * @return a random vector as a newly built array of double\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 46)",
        "(line 73,col 5)-(line 75,col 5)",
        "(line 77,col 5)-(line 77,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Standard deviation vector. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Underlying scalar generator. "
    }
  ]
}