{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/transform/FastSineTransformerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformerTest",
      "is_interface": false,
      "parent_types": [
        "RealTransformerAbstractTest"
      ],
      "begin_line": 42,
      "end_line": 301,
      "comment": "\n * Test case for fast sine transformer.\n * \u003cp\u003e\n * FST algorithm is exact, the small tolerance number is used only\n * to account for round-off errors.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "normalization"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidDataSize"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "relativeTolerance"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validDataSize"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.FastSineTransformerTest(org.apache.commons.math3.transform.DstNormalization)",
      "begin_line": 53,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 43)",
        "(line 55,col 9)-(line 57,col 10)",
        "(line 58,col 9)-(line 60,col 10)",
        "(line 61,col 9)-(line 63,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.data()",
      "begin_line": 72,
      "end_line": 80,
      "comment": "\n     * Returns an array containing {@code true, false} in order to check both\n     * standard and orthogonal DSTs.\n     *\n     * @return an array of parameters for this parameterized test\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 75)",
        "(line 75,col 9)-(line 75,col 78)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.createRealData(int)",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Overriding the default implementation allows to ensure that the first\n     * element of the data set is zero.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 54)",
        "(line 91,col 9)-(line 91,col 22)",
        "(line 92,col 9)-(line 92,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.createRealTransformer()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.getInvalidDataSize(int)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.getNumberOfInvalidDataSizes()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.getNumberOfValidDataSizes()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.getRelativeTolerance(int)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.getValidDataSize(int)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.getValidFunction()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.getValidLowerBound()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.getValidUpperBound()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.transform(double[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 140,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 31)",
        "(line 143,col 9)-(line 143,col 41)",
        "(line 144,col 9)-(line 144,col 47)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 23)",
        "(line 156,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 40)",
        "(line 180,col 9)-(line 180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.testTransformRealFirstElementNotZero()",
      "begin_line": 186,
      "end_line": 201,
      "comment": "\n     * Additional tests.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 60)",
        "(line 189,col 9)-(line 191,col 10)",
        "(line 192,col 9)-(line 192,col 68)",
        "(line 193,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.testAdHocData()",
      "begin_line": 210,
      "end_line": 243,
      "comment": "\n     * Test of transformer for the ad hoc data.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 40)",
        "(line 213,col 9)-(line 213,col 79)",
        "(line 214,col 9)-(line 214,col 43)",
        "(line 216,col 9)-(line 216,col 64)",
        "(line 217,col 9)-(line 219,col 61)",
        "(line 221,col 9)-(line 221,col 65)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 65)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 68)",
        "(line 232,col 9)-(line 232,col 81)",
        "(line 234,col 9)-(line 234,col 65)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 65)",
        "(line 240,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.testSinFunction()",
      "begin_line": 248,
      "end_line": 268,
      "comment": "\n     * Test of transformer for the sine function.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 41)",
        "(line 251,col 9)-(line 251,col 40)",
        "(line 252,col 9)-(line 252,col 79)",
        "(line 253,col 9)-(line 253,col 53)",
        "(line 253,col 55)-(line 253,col 69)",
        "(line 255,col 9)-(line 255,col 18)",
        "(line 255,col 20)-(line 255,col 43)",
        "(line 256,col 9)-(line 256,col 78)",
        "(line 257,col 9)-(line 257,col 58)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 27)",
        "(line 262,col 29)-(line 262,col 46)",
        "(line 263,col 9)-(line 263,col 78)",
        "(line 264,col 9)-(line 264,col 61)",
        "(line 265,col 9)-(line 267,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastSineTransformerTest.testParameters()",
      "begin_line": 273,
      "end_line": 300,
      "comment": "\n     * Test of parameters for the transformer.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 41)",
        "(line 276,col 9)-(line 276,col 40)",
        "(line 277,col 9)-(line 277,col 79)",
        "(line 279,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 299,col 9)"
      ]
    }
  ]
}