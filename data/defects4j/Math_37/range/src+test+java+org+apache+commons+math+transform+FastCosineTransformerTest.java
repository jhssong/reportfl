{
  "filepath": "/tmp/Math-37b/src/test/java/org/apache/commons/math/transform/FastCosineTransformerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastCosineTransformerTest",
      "is_interface": false,
      "parent_types": [
        "RealTransformerAbstractTest"
      ],
      "begin_line": 40,
      "end_line": 262,
      "comment": "\n * Test case for fast cosine transformer.\n * \u003cp\u003e\n * FCT algorithm is exact, the small tolerance number is used only to account\n * for round-off errors.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "standard"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidDataSize"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "relativeTolerance"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validDataSize"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.FastCosineTransformerTest(boolean)",
      "begin_line": 52,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 33)",
        "(line 54,col 9)-(line 56,col 10)",
        "(line 57,col 9)-(line 59,col 10)",
        "(line 60,col 9)-(line 62,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.data()",
      "begin_line": 71,
      "end_line": 81,
      "comment": "\n     * Returns an array containing {@code true, false} in order to check both\n     * standard and orthogonal DCTs.\n     *\n     * @return an array of parameters for this parameterized test\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 79,col 10)",
        "(line 80,col 9)-(line 80,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.createRealTransformer()",
      "begin_line": 83,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.getInvalidDataSize(int)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.getNumberOfInvalidDataSizes()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.getNumberOfValidDataSizes()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.getRelativeTolerance(int)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.getValidDataSize(int)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.getValidFunction()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.getValidLowerBound()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.getValidUpperBound()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.transform(double[], boolean)",
      "begin_line": 132,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 31)",
        "(line 135,col 9)-(line 135,col 41)",
        "(line 136,col 9)-(line 136,col 53)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 20)",
        "(line 141,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 23)",
        "(line 150,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 40)",
        "(line 156,col 9)-(line 156,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.testAdHocData()",
      "begin_line": 164,
      "end_line": 201,
      "comment": " Test of transformer for the ad hoc data. ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 75)",
        "(line 167,col 9)-(line 167,col 43)",
        "(line 169,col 9)-(line 171,col 10)",
        "(line 172,col 9)-(line 177,col 14)",
        "(line 179,col 9)-(line 179,col 42)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 49)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 74)",
        "(line 191,col 9)-(line 191,col 63)",
        "(line 192,col 9)-(line 192,col 42)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 49)",
        "(line 198,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.testParameters()",
      "begin_line": 204,
      "end_line": 233,
      "comment": " Test of parameters for the transformer. ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 49)",
        "(line 208,col 9)-(line 208,col 75)",
        "(line 210,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformerTest.testSinFunction()",
      "begin_line": 236,
      "end_line": 261,
      "comment": " Test of transformer for the sine function. ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 49)",
        "(line 239,col 9)-(line 239,col 75)",
        "(line 240,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 241,col 18)",
        "(line 243,col 9)-(line 247,col 14)",
        "(line 248,col 9)-(line 248,col 18)",
        "(line 249,col 9)-(line 249,col 46)",
        "(line 250,col 9)-(line 250,col 55)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 27)",
        "(line 256,col 9)-(line 256,col 46)",
        "(line 257,col 9)-(line 257,col 55)",
        "(line 258,col 9)-(line 260,col 9)"
      ]
    }
  ]
}