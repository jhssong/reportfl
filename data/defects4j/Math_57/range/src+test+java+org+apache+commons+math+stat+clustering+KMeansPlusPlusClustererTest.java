{
  "filepath": "/tmp/Math-57b/src/test/java/org/apache/commons/math/stat/clustering/KMeansPlusPlusClustererTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KMeansPlusPlusClustererTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.dimension2()",
      "begin_line": 34,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 37,col 91)",
        "(line 38,col 9)-(line 67,col 10)",
        "(line 68,col 9)-(line 69,col 62)",
        "(line 71,col 9)-(line 71,col 41)",
        "(line 72,col 9)-(line 72,col 38)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 38)",
        "(line 75,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 34)",
        "(line 95,col 9)-(line 95,col 34)",
        "(line 96,col 9)-(line 96,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.testPerformClusterAnalysisDegenerate()",
      "begin_line": 105,
      "end_line": 120,
      "comment": "\n     * JIRA: MATH-305\n     *\n     * Two points, one cluster, one iteration\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 111,col 73)",
        "(line 112,col 9)-(line 112,col 105)",
        "(line 113,col 9)-(line 113,col 41)",
        "(line 114,col 9)-(line 114,col 62)",
        "(line 115,col 9)-(line 115,col 90)",
        "(line 116,col 9)-(line 116,col 90)",
        "(line 117,col 9)-(line 117,col 62)",
        "(line 118,col 9)-(line 118,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.testCertainSpace()",
      "begin_line": 122,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 128,col 10)",
        "(line 129,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CloseIntegerPoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.clustering.Clusterable\u003corg.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint\u003e"
      ],
      "begin_line": 175,
      "end_line": 209,
      "comment": "\n     * A helper class for testSmallDistances(). This class is similar to EuclideanIntegerPoint, but\n     * it defines a different distanceFrom() method that tends to return distances less than 1.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.CloseIntegerPoint(org.apache.commons.math.stat.clustering.EuclideanIntegerPoint)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.distanceFrom(org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 13)-(line 181,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.centroidOf(java.util.Collection\u003corg.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint\u003e)",
      "begin_line": 184,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 185,col 13)-(line 186,col 55)",
        "(line 187,col 13)-(line 189,col 13)",
        "(line 190,col 13)-(line 190,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.equals(java.lang.Object)",
      "begin_line": 193,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 197,col 13)",
        "(line 198,col 13)-(line 198,col 56)",
        "(line 200,col 13)-(line 200,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.CloseIntegerPoint.hashCode()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 13)-(line 205,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "euclideanPoint"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest.testSmallDistances()",
      "begin_line": 214,
      "end_line": 250,
      "comment": "\n     * Test points that are very close together. See issue MATH-546.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 36)",
        "(line 219,col 9)-(line 219,col 34)",
        "(line 220,col 9)-(line 221,col 76)",
        "(line 222,col 9)-(line 223,col 74)",
        "(line 225,col 9)-(line 225,col 82)",
        "(line 226,col 9)-(line 226,col 50)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 32)",
        "(line 234,col 9)-(line 234,col 35)",
        "(line 235,col 9)-(line 235,col 35)",
        "(line 236,col 9)-(line 236,col 37)",
        "(line 237,col 9)-(line 238,col 84)",
        "(line 239,col 9)-(line 240,col 68)",
        "(line 243,col 9)-(line 243,col 44)",
        "(line 244,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 40)"
      ]
    }
  ]
}