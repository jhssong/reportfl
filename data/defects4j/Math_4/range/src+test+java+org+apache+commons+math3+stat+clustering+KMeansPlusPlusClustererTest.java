{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/clustering/KMeansPlusPlusClustererTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClustererTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.dimension2()",
      "begin_line": 33,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 36,col 91)",
        "(line 37,col 9)-(line 66,col 10)",
        "(line 67,col 9)-(line 68,col 65)",
        "(line 70,col 9)-(line 70,col 48)",
        "(line 71,col 9)-(line 71,col 38)",
        "(line 72,col 9)-(line 72,col 38)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 95,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.testPerformClusterAnalysisDegenerate()",
      "begin_line": 104,
      "end_line": 119,
      "comment": "\n     * JIRA: MATH-305\n     *\n     * Two points, one cluster, one iteration\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 44)",
        "(line 108,col 9)-(line 110,col 73)",
        "(line 111,col 9)-(line 111,col 105)",
        "(line 112,col 9)-(line 112,col 48)",
        "(line 113,col 9)-(line 113,col 69)",
        "(line 114,col 9)-(line 114,col 90)",
        "(line 115,col 9)-(line 115,col 90)",
        "(line 116,col 9)-(line 116,col 69)",
        "(line 117,col 9)-(line 117,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.testCertainSpace()",
      "begin_line": 121,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 127,col 10)",
        "(line 128,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CloseIntegerPoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.clustering.Clusterable\u003corg.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint\u003e"
      ],
      "begin_line": 174,
      "end_line": 208,
      "comment": "\n     * A helper class for testSmallDistances(). This class is similar to EuclideanIntegerPoint, but\n     * it defines a different distanceFrom() method that tends to return distances less than 1.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.CloseIntegerPoint(org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 13)-(line 176,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.distanceFrom(org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.centroidOf(java.util.Collection\u003corg.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint\u003e)",
      "begin_line": 183,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 185,col 55)",
        "(line 186,col 13)-(line 188,col 13)",
        "(line 189,col 13)-(line 189,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.equals(java.lang.Object)",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 194,col 13)-(line 196,col 13)",
        "(line 197,col 13)-(line 197,col 56)",
        "(line 199,col 13)-(line 199,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.hashCode()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "euclideanPoint"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.testSmallDistances()",
      "begin_line": 213,
      "end_line": 249,
      "comment": "\n     * Test points that are very close together. See issue MATH-546.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 36)",
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 220,col 76)",
        "(line 221,col 9)-(line 222,col 74)",
        "(line 224,col 9)-(line 224,col 82)",
        "(line 225,col 9)-(line 225,col 50)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 32)",
        "(line 233,col 9)-(line 233,col 35)",
        "(line 234,col 9)-(line 234,col 35)",
        "(line 235,col 9)-(line 235,col 37)",
        "(line 236,col 9)-(line 237,col 84)",
        "(line 238,col 9)-(line 239,col 68)",
        "(line 242,col 9)-(line 242,col 44)",
        "(line 243,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.testPerformClusterAnalysisToManyClusters()",
      "begin_line": 254,
      "end_line": 270,
      "comment": "\n     * 2 variables cannot be clustered into 3 clusters. See issue MATH-436.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 258,col 48)",
        "(line 260,col 9)-(line 266,col 10)",
        "(line 268,col 9)-(line 268,col 57)"
      ]
    }
  ]
}