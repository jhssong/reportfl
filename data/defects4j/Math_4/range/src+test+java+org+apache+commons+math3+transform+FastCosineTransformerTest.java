{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/transform/FastCosineTransformerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastCosineTransformerTest",
      "is_interface": false,
      "parent_types": [
        "RealTransformerAbstractTest"
      ],
      "begin_line": 41,
      "end_line": 278,
      "comment": "\n * Test case for fast cosine transformer.\n * \u003cp\u003e\n * FCT algorithm is exact, the small tolerance number is used only to account\n * for round-off errors.\n *\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.FastCosineTransformerTest(org.apache.commons.math3.transform.DctNormalization)",
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
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.data()",
      "begin_line": 72,
      "end_line": 80,
      "comment": "\n     * Returns an array containing {@code true, false} in order to check both\n     * standard and orthogonal DCTs.\n     *\n     * @return an array of parameters for this parameterized test\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 75)",
        "(line 75,col 9)-(line 75,col 78)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.createRealTransformer()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.getInvalidDataSize(int)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.getNumberOfInvalidDataSizes()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.getNumberOfValidDataSizes()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.getRelativeTolerance(int)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.getValidDataSize(int)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.getValidFunction()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.getValidLowerBound()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.getValidUpperBound()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.transform(double[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 127,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 31)",
        "(line 130,col 9)-(line 130,col 41)",
        "(line 131,col 9)-(line 131,col 53)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 20)",
        "(line 136,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 23)",
        "(line 145,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 40)",
        "(line 169,col 9)-(line 169,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.testAdHocData()",
      "begin_line": 177,
      "end_line": 215,
      "comment": " Test of transformer for the ad hoc data. ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 42)",
        "(line 180,col 9)-(line 180,col 81)",
        "(line 181,col 9)-(line 181,col 43)",
        "(line 183,col 9)-(line 185,col 10)",
        "(line 186,col 9)-(line 191,col 14)",
        "(line 193,col 9)-(line 193,col 65)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 65)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 74)",
        "(line 205,col 9)-(line 205,col 83)",
        "(line 206,col 9)-(line 206,col 65)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 65)",
        "(line 212,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.testParameters()",
      "begin_line": 218,
      "end_line": 248,
      "comment": " Test of parameters for the transformer. ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 41)",
        "(line 222,col 9)-(line 222,col 42)",
        "(line 223,col 9)-(line 223,col 81)",
        "(line 225,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastCosineTransformerTest.testSinFunction()",
      "begin_line": 251,
      "end_line": 277,
      "comment": " Test of transformer for the sine function. ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 41)",
        "(line 254,col 9)-(line 254,col 42)",
        "(line 255,col 9)-(line 255,col 81)",
        "(line 256,col 9)-(line 256,col 53)",
        "(line 257,col 9)-(line 257,col 18)",
        "(line 259,col 9)-(line 263,col 14)",
        "(line 264,col 9)-(line 264,col 18)",
        "(line 265,col 9)-(line 265,col 46)",
        "(line 266,col 9)-(line 266,col 78)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 27)",
        "(line 272,col 9)-(line 272,col 46)",
        "(line 273,col 9)-(line 273,col 78)",
        "(line 274,col 9)-(line 276,col 9)"
      ]
    }
  ]
}