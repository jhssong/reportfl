{
  "filepath": "/tmp/Math-3b/src/test/java/org/apache/commons/math3/userguide/LowDiscrepancyGeneratorComparison.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LowDiscrepancyGeneratorComparison",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 252,
      "comment": "\n * Plots 2D samples drawn from various pseudo / quasi-random generators.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.makeCircle(int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 53,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 58)",
        "(line 55,col 9)-(line 59,col 9)",
        "(line 62,col 9)-(line 62,col 35)",
        "(line 65,col 9)-(line 65,col 64)",
        "(line 66,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.makeRandom(int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 76,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 58)",
        "(line 78,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 84,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.normalize(java.util.List\u003corg.apache.commons.math3.geometry.euclidean.twod.Vector2D\u003e)",
      "begin_line": 87,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 39)",
        "(line 90,col 9)-(line 90,col 39)",
        "(line 91,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 26)",
        "(line 99,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 36)",
        "(line 108,col 9)-(line 108,col 36)",
        "(line 109,col 9)-(line 109,col 58)",
        "(line 110,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Display",
      "is_interface": false,
      "parent_types": [
        "ExampleFrame"
      ],
      "begin_line": 120,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.Display.Display()",
      "begin_line": 123,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 67)",
        "(line 125,col 13)-(line 125,col 30)",
        "(line 127,col 13)-(line 127,col 43)",
        "(line 129,col 13)-(line 129,col 65)",
        "(line 130,col 13)-(line 130,col 120)",
        "(line 132,col 13)-(line 133,col 117)",
        "(line 134,col 13)-(line 148,col 16)",
        "(line 149,col 13)-(line 149,col 118)",
        "(line 150,col 13)-(line 150,col 116)",
        "(line 152,col 13)-(line 152,col 60)",
        "(line 153,col 13)-(line 153,col 49)",
        "(line 154,col 13)-(line 154,col 24)",
        "(line 155,col 13)-(line 155,col 24)",
        "(line 156,col 13)-(line 156,col 46)",
        "(line 158,col 13)-(line 164,col 13)",
        "(line 165,col 13)-(line 165,col 34)",
        "(line 167,col 13)-(line 167,col 24)",
        "(line 168,col 13)-(line 173,col 13)",
        "(line 175,col 13)-(line 175,col 28)",
        "(line 176,col 13)-(line 201,col 13)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "rngs"
      ],
      "begin_line": 136,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.Display.Anonymous-1317177c-0aa2-469a-95c6-e2f0aabf6f65.nextVector()",
      "begin_line": 141,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 142,col 21)-(line 142,col 58)",
        "(line 143,col 21)-(line 143,col 53)",
        "(line 144,col 21)-(line 144,col 53)",
        "(line 145,col 21)-(line 145,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Plot",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JComponent"
      ],
      "begin_line": 205,
      "end_line": 247,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PAD"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.Plot.Plot(java.util.List\u003corg.apache.commons.math3.geometry.euclidean.twod.Vector2D\u003e)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.Plot.paintComponent(java.awt.Graphics)",
      "begin_line": 216,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 36)",
        "(line 218,col 13)-(line 218,col 42)",
        "(line 219,col 13)-(line 220,col 67)",
        "(line 222,col 13)-(line 222,col 31)",
        "(line 223,col 13)-(line 223,col 32)",
        "(line 225,col 13)-(line 225,col 37)",
        "(line 227,col 13)-(line 227,col 37)",
        "(line 228,col 13)-(line 228,col 44)",
        "(line 230,col 13)-(line 234,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.Plot.getPreferredSize()",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.Plot.transform(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, int, int)",
      "begin_line": 242,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 43)",
        "(line 244,col 13)-(line 245,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.userguide.LowDiscrepancyGeneratorComparison.main(java.lang.String[])",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 53)"
      ]
    }
  ]
}