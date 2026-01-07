{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/random/UncorrelatedRandomVectorGenerator.java",
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
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.UncorrelatedRandomVectorGenerator(double[], double[], org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 44,
      "end_line": 55,
      "comment": " Simple constructor.\n   * \u003cp\u003eBuild an uncorrelated random vector generator from\n   * its mean and standard deviation vectors.\u003c/p\u003e\n   * @param mean expected mean values for each component\n   * @param standardDeviation standard deviation for each component\n   * @param generator underlying generator for uncorrelated normalized\n   * components\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 51,col 5)",
        "(line 52,col 5)-(line 52,col 42)",
        "(line 53,col 5)-(line 53,col 55)",
        "(line 54,col 5)-(line 54,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.UncorrelatedRandomVectorGenerator(int, org.apache.commons.math.random.NormalizedRandomGenerator)",
      "begin_line": 64,
      "end_line": 70,
      "comment": " Simple constructor.\n   * \u003cp\u003eBuild a null mean random and unit standard deviation\n   * uncorrelated vector generator\u003c/p\u003e\n   * @param dimension dimension of the vectors to generate\n   * @param generator underlying generator for uncorrelated normalized\n   * components\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 46)",
        "(line 67,col 5)-(line 67,col 46)",
        "(line 68,col 5)-(line 68,col 40)",
        "(line 69,col 5)-(line 69,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator.nextVector()",
      "begin_line": 75,
      "end_line": 84,
      "comment": " Generate an uncorrelated random vector.\n   * @return a random vector as a newly built array of double\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 46)",
        "(line 78,col 5)-(line 80,col 5)",
        "(line 82,col 5)-(line 82,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Mean vector. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Standard deviation vector. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Underlying scalar generator. "
    }
  ]
}