{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ml/clustering/KMeansPlusPlusClustererTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClustererTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.setUp()",
      "begin_line": 37,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 42)",
        "(line 40,col 9)-(line 40,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.testPerformClusterAnalysisDegenerate()",
      "begin_line": 48,
      "end_line": 64,
      "comment": "\n     * JIRA: MATH-305\n     *\n     * Two points, one cluster, one iteration\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 51,col 63)",
        "(line 53,col 9)-(line 55,col 63)",
        "(line 56,col 9)-(line 56,col 99)",
        "(line 57,col 9)-(line 57,col 48)",
        "(line 58,col 9)-(line 58,col 69)",
        "(line 59,col 9)-(line 59,col 70)",
        "(line 60,col 9)-(line 60,col 70)",
        "(line 61,col 9)-(line 61,col 69)",
        "(line 62,col 9)-(line 62,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.testCertainSpace()",
      "begin_line": 66,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 72,col 10)",
        "(line 73,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CloseDistance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ml.distance.EuclideanDistance"
      ],
      "begin_line": 121,
      "end_line": 128,
      "comment": "\n     * A helper class for testSmallDistances(). This class is similar to DoublePoint, but\n     * it defines a different distanceFrom() method that tends to return distances less than 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.CloseDistance.compute(double[], double[])",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.testSmallDistances()",
      "begin_line": 133,
      "end_line": 169,
      "comment": "\n     * Test points that are very close together. See issue MATH-546.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 36)",
        "(line 138,col 9)-(line 138,col 34)",
        "(line 139,col 9)-(line 139,col 67)",
        "(line 140,col 9)-(line 140,col 63)",
        "(line 142,col 9)-(line 142,col 70)",
        "(line 143,col 9)-(line 143,col 50)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 32)",
        "(line 151,col 9)-(line 151,col 35)",
        "(line 152,col 9)-(line 152,col 35)",
        "(line 153,col 9)-(line 153,col 37)",
        "(line 154,col 9)-(line 154,col 36)",
        "(line 156,col 9)-(line 158,col 49)",
        "(line 159,col 9)-(line 159,col 80)",
        "(line 162,col 9)-(line 162,col 44)",
        "(line 163,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.testPerformClusterAnalysisToManyClusters()",
      "begin_line": 174,
      "end_line": 189,
      "comment": "\n     * 2 variables cannot be clustered into 3 clusters. See issue MATH-436.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 177,col 92)",
        "(line 179,col 9)-(line 185,col 10)",
        "(line 187,col 9)-(line 187,col 51)"
      ]
    }
  ]
}