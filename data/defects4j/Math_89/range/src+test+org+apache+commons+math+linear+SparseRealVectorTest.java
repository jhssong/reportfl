{
  "filepath": "/tmp/Math-89b/src/test/org/apache/commons/math/linear/SparseRealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealVectorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 1152,
      "comment": "\n * Test cases for the {@link SparseRealVector} class.\n *\n * @version $Revision: 728186 $ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SparseRealVectorTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 459,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.SparseRealVectorTestImpl(double[])",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.unsupported()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.copy()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 68,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.add(double[])",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.subtract(double[])",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAdd(double)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAddToSelf(double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSubtract(double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSubtractToSelf(double)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapMultiply(double)",
      "begin_line": 99,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 51)",
        "(line 101,col 13)-(line 103,col 13)",
        "(line 104,col 13)-(line 104,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapMultiplyToSelf(double)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapDivide(double)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 13)-(line 112,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapDivideToSelf(double)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapPow(double)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapPowToSelf(double)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapExp()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapExpToSelf()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapExpm1()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapExpm1ToSelf()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLogToSelf()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog10()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog10ToSelf()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog1p()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog1pToSelf()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCosh()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCoshToSelf()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 172,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSinh()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 13)-(line 176,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSinhToSelf()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapTanh()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapTanhToSelf()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCos()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCosToSelf()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSin()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 13)-(line 200,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSinToSelf()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapTan()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapTanToSelf()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAcos()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAcosToSelf()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAsin()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAsinToSelf()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAtan()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAtanToSelf()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapInv()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapInvToSelf()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAbs()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAbsToSelf()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSqrt()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSqrtToSelf()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCbrt()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCbrtToSelf()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCeil()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCeilToSelf()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapFloor()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapFloorToSelf()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapRint()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 13)-(line 288,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapRintToSelf()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSignum()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSignumToSelf()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 13)-(line 300,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapUlp()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 304,col 13)-(line 304,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapUlpToSelf()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 13)-(line 308,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 311,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 13)-(line 312,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.ebeMultiply(double[])",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.ebeDivide(double[])",
      "begin_line": 323,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getData()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 328,col 13)-(line 328,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 331,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 332,col 13)-(line 332,col 27)",
        "(line 333,col 13)-(line 335,col 13)",
        "(line 336,col 13)-(line 336,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.dotProduct(double[])",
      "begin_line": 339,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 340,col 13)-(line 340,col 27)",
        "(line 341,col 13)-(line 343,col 13)",
        "(line 344,col 13)-(line 344,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getNorm()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getL1Norm()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getLInfNorm()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 13)-(line 360,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getDistance(double[])",
      "begin_line": 363,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 364,col 13)-(line 364,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getL1Distance(double[])",
      "begin_line": 371,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getLInfDistance(double[])",
      "begin_line": 379,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 380,col 13)-(line 380,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.unitVector()",
      "begin_line": 383,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 384,col 13)-(line 384,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.unitize()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 388,col 13)-(line 388,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 392,col 13)-(line 392,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.projection(double[])",
      "begin_line": 395,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 396,col 13)-(line 396,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.outerProduct(double[])",
      "begin_line": 403,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 13)-(line 404,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getEntry(int)",
      "begin_line": 407,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 408,col 13)-(line 408,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getDimension()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 412,col 13)-(line 412,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 416,col 13)-(line 416,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.append(double)",
      "begin_line": 419,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.append(double[])",
      "begin_line": 423,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 424,col 13)-(line 424,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 428,col 13)-(line 428,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.setEntry(int, double)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 435,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 436,col 13)-(line 436,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.setSubVector(int, double[])",
      "begin_line": 439,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 440,col 13)-(line 440,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.set(double)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 444,col 13)-(line 444,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.toArray()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 448,col 13)-(line 448,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.isNaN()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 452,col 13)-(line 452,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.isInfinite()",
      "begin_line": 455,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 456,col 13)-(line 456,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.suite()",
      "begin_line": 461,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 68)",
        "(line 463,col 9)-(line 463,col 48)",
        "(line 464,col 9)-(line 464,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testConstructors()",
      "begin_line": 467,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 53)",
        "(line 470,col 9)-(line 470,col 59)",
        "(line 472,col 9)-(line 472,col 54)",
        "(line 473,col 9)-(line 473,col 59)",
        "(line 474,col 9)-(line 474,col 62)",
        "(line 476,col 9)-(line 476,col 57)",
        "(line 477,col 9)-(line 477,col 59)",
        "(line 478,col 9)-(line 478,col 62)",
        "(line 492,col 9)-(line 492,col 54)",
        "(line 493,col 9)-(line 493,col 61)",
        "(line 494,col 9)-(line 494,col 64)",
        "(line 496,col 9)-(line 496,col 58)",
        "(line 497,col 9)-(line 497,col 59)",
        "(line 498,col 9)-(line 498,col 62)",
        "(line 512,col 9)-(line 512,col 55)",
        "(line 513,col 9)-(line 513,col 59)",
        "(line 514,col 9)-(line 514,col 62)",
        "(line 516,col 9)-(line 516,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testDataInOut()",
      "begin_line": 539,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 57)",
        "(line 542,col 9)-(line 542,col 57)",
        "(line 543,col 9)-(line 543,col 57)",
        "(line 544,col 9)-(line 544,col 75)",
        "(line 546,col 9)-(line 546,col 46)",
        "(line 547,col 9)-(line 547,col 67)",
        "(line 548,col 9)-(line 548,col 70)",
        "(line 550,col 9)-(line 550,col 47)",
        "(line 551,col 9)-(line 551,col 67)",
        "(line 552,col 9)-(line 552,col 70)",
        "(line 554,col 9)-(line 554,col 48)",
        "(line 555,col 9)-(line 555,col 67)",
        "(line 556,col 9)-(line 556,col 67)",
        "(line 558,col 6)-(line 558,col 45)",
        "(line 559,col 9)-(line 559,col 67)",
        "(line 560,col 9)-(line 560,col 70)",
        "(line 562,col 9)-(line 562,col 49)",
        "(line 563,col 9)-(line 563,col 62)",
        "(line 564,col 9)-(line 564,col 65)",
        "(line 565,col 9)-(line 572,col 9)",
        "(line 574,col 9)-(line 574,col 63)",
        "(line 575,col 9)-(line 575,col 33)",
        "(line 576,col 9)-(line 576,col 68)",
        "(line 577,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 63)",
        "(line 587,col 9)-(line 587,col 35)",
        "(line 588,col 9)-(line 588,col 66)",
        "(line 589,col 9)-(line 589,col 66)",
        "(line 590,col 9)-(line 597,col 9)",
        "(line 599,col 9)-(line 599,col 63)",
        "(line 600,col 9)-(line 600,col 25)",
        "(line 601,col 9)-(line 601,col 68)",
        "(line 603,col 9)-(line 610,col 9)",
        "(line 612,col 9)-(line 612,col 63)",
        "(line 613,col 9)-(line 613,col 37)",
        "(line 614,col 9)-(line 614,col 66)",
        "(line 615,col 9)-(line 615,col 66)",
        "(line 616,col 9)-(line 623,col 9)",
        "(line 626,col 9)-(line 626,col 63)",
        "(line 627,col 9)-(line 627,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testMapFunctions()",
      "begin_line": 635,
      "end_line": 961,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 57)",
        "(line 639,col 9)-(line 639,col 46)",
        "(line 640,col 9)-(line 640,col 46)",
        "(line 641,col 9)-(line 641,col 87)",
        "(line 644,col 9)-(line 644,col 46)",
        "(line 645,col 9)-(line 645,col 42)",
        "(line 646,col 9)-(line 646,col 52)",
        "(line 647,col 9)-(line 647,col 99)",
        "(line 650,col 9)-(line 650,col 56)",
        "(line 651,col 9)-(line 651,col 52)",
        "(line 652,col 9)-(line 652,col 97)",
        "(line 655,col 9)-(line 655,col 51)",
        "(line 656,col 9)-(line 656,col 52)",
        "(line 657,col 9)-(line 657,col 58)",
        "(line 658,col 9)-(line 658,col 109)",
        "(line 661,col 9)-(line 661,col 56)",
        "(line 662,col 9)-(line 662,col 51)",
        "(line 663,col 9)-(line 663,col 97)",
        "(line 666,col 9)-(line 666,col 51)",
        "(line 667,col 9)-(line 667,col 52)",
        "(line 668,col 9)-(line 668,col 57)",
        "(line 669,col 9)-(line 669,col 109)",
        "(line 672,col 9)-(line 672,col 52)",
        "(line 673,col 9)-(line 673,col 52)",
        "(line 674,col 9)-(line 674,col 93)",
        "(line 677,col 9)-(line 677,col 49)",
        "(line 678,col 9)-(line 678,col 48)",
        "(line 679,col 9)-(line 679,col 58)",
        "(line 680,col 9)-(line 680,col 105)",
        "(line 683,col 9)-(line 683,col 46)",
        "(line 684,col 9)-(line 684,col 46)",
        "(line 685,col 9)-(line 685,col 87)",
        "(line 688,col 9)-(line 688,col 46)",
        "(line 689,col 9)-(line 689,col 42)",
        "(line 690,col 9)-(line 690,col 52)",
        "(line 691,col 9)-(line 691,col 99)",
        "(line 694,col 9)-(line 694,col 42)",
        "(line 695,col 9)-(line 695,col 105)",
        "(line 696,col 9)-(line 696,col 87)",
        "(line 699,col 9)-(line 699,col 46)",
        "(line 700,col 9)-(line 700,col 38)",
        "(line 701,col 9)-(line 701,col 111)",
        "(line 702,col 9)-(line 702,col 99)",
        "(line 706,col 9)-(line 706,col 46)",
        "(line 707,col 9)-(line 707,col 95)",
        "(line 708,col 9)-(line 708,col 91)",
        "(line 711,col 9)-(line 711,col 48)",
        "(line 712,col 9)-(line 712,col 42)",
        "(line 713,col 9)-(line 713,col 101)",
        "(line 714,col 9)-(line 714,col 103)",
        "(line 717,col 9)-(line 717,col 42)",
        "(line 718,col 9)-(line 718,col 85)",
        "(line 719,col 9)-(line 719,col 87)",
        "(line 722,col 9)-(line 722,col 46)",
        "(line 723,col 9)-(line 723,col 38)",
        "(line 724,col 9)-(line 724,col 91)",
        "(line 725,col 9)-(line 725,col 99)",
        "(line 728,col 9)-(line 728,col 46)",
        "(line 729,col 9)-(line 729,col 87)",
        "(line 730,col 9)-(line 730,col 91)",
        "(line 733,col 9)-(line 733,col 48)",
        "(line 734,col 9)-(line 734,col 42)",
        "(line 735,col 9)-(line 735,col 93)",
        "(line 736,col 9)-(line 736,col 103)",
        "(line 739,col 9)-(line 739,col 46)",
        "(line 740,col 9)-(line 740,col 97)",
        "(line 741,col 9)-(line 741,col 91)",
        "(line 744,col 9)-(line 744,col 48)",
        "(line 745,col 9)-(line 745,col 42)",
        "(line 746,col 9)-(line 746,col 103)",
        "(line 747,col 9)-(line 747,col 103)",
        "(line 750,col 9)-(line 750,col 44)",
        "(line 751,col 9)-(line 751,col 106)",
        "(line 752,col 9)-(line 752,col 89)",
        "(line 755,col 9)-(line 755,col 47)",
        "(line 756,col 9)-(line 756,col 40)",
        "(line 757,col 9)-(line 757,col 112)",
        "(line 758,col 9)-(line 758,col 101)",
        "(line 761,col 9)-(line 761,col 44)",
        "(line 762,col 9)-(line 762,col 106)",
        "(line 763,col 9)-(line 763,col 89)",
        "(line 766,col 9)-(line 766,col 47)",
        "(line 767,col 9)-(line 767,col 40)",
        "(line 768,col 9)-(line 768,col 112)",
        "(line 769,col 9)-(line 769,col 101)",
        "(line 772,col 9)-(line 772,col 44)",
        "(line 773,col 9)-(line 773,col 105)",
        "(line 774,col 9)-(line 774,col 89)",
        "(line 777,col 9)-(line 777,col 47)",
        "(line 778,col 9)-(line 778,col 40)",
        "(line 779,col 9)-(line 779,col 111)",
        "(line 780,col 9)-(line 780,col 101)",
        "(line 783,col 9)-(line 783,col 42)",
        "(line 784,col 9)-(line 784,col 107)",
        "(line 785,col 9)-(line 785,col 87)",
        "(line 788,col 9)-(line 788,col 46)",
        "(line 789,col 9)-(line 789,col 38)",
        "(line 790,col 9)-(line 790,col 113)",
        "(line 791,col 9)-(line 791,col 99)",
        "(line 794,col 9)-(line 794,col 42)",
        "(line 795,col 9)-(line 795,col 104)",
        "(line 796,col 9)-(line 796,col 87)",
        "(line 799,col 9)-(line 799,col 46)",
        "(line 800,col 9)-(line 800,col 38)",
        "(line 801,col 9)-(line 801,col 110)",
        "(line 802,col 9)-(line 802,col 99)",
        "(line 805,col 9)-(line 805,col 42)",
        "(line 806,col 9)-(line 806,col 106)",
        "(line 807,col 9)-(line 807,col 87)",
        "(line 810,col 9)-(line 810,col 46)",
        "(line 811,col 9)-(line 811,col 38)",
        "(line 812,col 9)-(line 812,col 112)",
        "(line 813,col 9)-(line 813,col 99)",
        "(line 815,col 9)-(line 815,col 42)",
        "(line 816,col 9)-(line 816,col 59)",
        "(line 819,col 9)-(line 819,col 45)",
        "(line 820,col 9)-(line 820,col 88)",
        "(line 821,col 9)-(line 821,col 89)",
        "(line 824,col 9)-(line 824,col 48)",
        "(line 825,col 9)-(line 825,col 40)",
        "(line 826,col 9)-(line 826,col 94)",
        "(line 827,col 9)-(line 827,col 101)",
        "(line 830,col 9)-(line 830,col 45)",
        "(line 831,col 9)-(line 831,col 87)",
        "(line 832,col 9)-(line 832,col 89)",
        "(line 835,col 9)-(line 835,col 48)",
        "(line 836,col 9)-(line 836,col 40)",
        "(line 837,col 9)-(line 837,col 93)",
        "(line 838,col 9)-(line 838,col 101)",
        "(line 841,col 9)-(line 841,col 45)",
        "(line 842,col 9)-(line 842,col 87)",
        "(line 843,col 9)-(line 843,col 89)",
        "(line 846,col 9)-(line 846,col 48)",
        "(line 847,col 9)-(line 847,col 40)",
        "(line 848,col 9)-(line 848,col 93)",
        "(line 849,col 9)-(line 849,col 101)",
        "(line 852,col 9)-(line 852,col 42)",
        "(line 853,col 9)-(line 853,col 66)",
        "(line 854,col 9)-(line 854,col 87)",
        "(line 857,col 9)-(line 857,col 46)",
        "(line 858,col 9)-(line 858,col 38)",
        "(line 859,col 9)-(line 859,col 72)",
        "(line 860,col 9)-(line 860,col 99)",
        "(line 862,col 9)-(line 862,col 45)",
        "(line 863,col 9)-(line 863,col 61)",
        "(line 866,col 9)-(line 866,col 45)",
        "(line 867,col 9)-(line 867,col 44)",
        "(line 868,col 9)-(line 868,col 87)",
        "(line 871,col 9)-(line 871,col 49)",
        "(line 872,col 9)-(line 872,col 38)",
        "(line 873,col 9)-(line 873,col 50)",
        "(line 874,col 9)-(line 874,col 99)",
        "(line 877,col 9)-(line 877,col 44)",
        "(line 878,col 9)-(line 878,col 85)",
        "(line 879,col 9)-(line 879,col 89)",
        "(line 882,col 9)-(line 882,col 47)",
        "(line 883,col 9)-(line 883,col 40)",
        "(line 884,col 9)-(line 884,col 91)",
        "(line 885,col 9)-(line 885,col 101)",
        "(line 887,col 9)-(line 887,col 46)",
        "(line 888,col 9)-(line 888,col 63)",
        "(line 891,col 9)-(line 891,col 48)",
        "(line 892,col 9)-(line 892,col 80)",
        "(line 893,col 9)-(line 893,col 89)",
        "(line 896,col 9)-(line 896,col 51)",
        "(line 897,col 9)-(line 897,col 40)",
        "(line 898,col 9)-(line 898,col 87)",
        "(line 899,col 9)-(line 899,col 101)",
        "(line 901,col 9)-(line 901,col 46)",
        "(line 902,col 9)-(line 902,col 63)",
        "(line 905,col 9)-(line 905,col 48)",
        "(line 906,col 9)-(line 906,col 46)",
        "(line 907,col 9)-(line 907,col 89)",
        "(line 910,col 9)-(line 910,col 51)",
        "(line 911,col 9)-(line 911,col 40)",
        "(line 912,col 9)-(line 912,col 53)",
        "(line 913,col 9)-(line 913,col 101)",
        "(line 916,col 9)-(line 916,col 50)",
        "(line 917,col 9)-(line 917,col 47)",
        "(line 918,col 9)-(line 918,col 91)",
        "(line 921,col 9)-(line 921,col 52)",
        "(line 922,col 9)-(line 922,col 42)",
        "(line 923,col 9)-(line 923,col 54)",
        "(line 924,col 9)-(line 924,col 103)",
        "(line 927,col 9)-(line 927,col 48)",
        "(line 928,col 9)-(line 928,col 46)",
        "(line 929,col 9)-(line 929,col 89)",
        "(line 932,col 9)-(line 932,col 51)",
        "(line 933,col 9)-(line 933,col 40)",
        "(line 934,col 9)-(line 934,col 53)",
        "(line 935,col 9)-(line 935,col 101)",
        "(line 938,col 9)-(line 938,col 52)",
        "(line 939,col 9)-(line 939,col 48)",
        "(line 940,col 9)-(line 940,col 93)",
        "(line 943,col 9)-(line 943,col 53)",
        "(line 944,col 9)-(line 944,col 44)",
        "(line 945,col 9)-(line 945,col 55)",
        "(line 946,col 9)-(line 946,col 105)",
        "(line 951,col 9)-(line 951,col 46)",
        "(line 952,col 9)-(line 952,col 105)",
        "(line 953,col 9)-(line 953,col 87)",
        "(line 956,col 9)-(line 956,col 50)",
        "(line 957,col 9)-(line 957,col 38)",
        "(line 958,col 9)-(line 958,col 111)",
        "(line 959,col 9)-(line 959,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testBasicFunctions()",
      "begin_line": 963,
      "end_line": 1086,
      "comment": "",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 57)",
        "(line 965,col 9)-(line 965,col 57)",
        "(line 966,col 9)-(line 966,col 65)",
        "(line 968,col 9)-(line 968,col 75)",
        "(line 971,col 9)-(line 971,col 40)",
        "(line 972,col 9)-(line 972,col 71)",
        "(line 974,col 9)-(line 974,col 44)",
        "(line 975,col 9)-(line 975,col 58)",
        "(line 977,col 9)-(line 977,col 48)",
        "(line 978,col 9)-(line 978,col 60)",
        "(line 981,col 9)-(line 981,col 41)",
        "(line 982,col 9)-(line 982,col 74)",
        "(line 985,col 9)-(line 985,col 45)",
        "(line 986,col 9)-(line 986,col 76)",
        "(line 989,col 9)-(line 989,col 55)",
        "(line 990,col 9)-(line 990,col 62)",
        "(line 992,col 9)-(line 992,col 59)",
        "(line 993,col 9)-(line 993,col 64)",
        "(line 996,col 9)-(line 996,col 59)",
        "(line 997,col 9)-(line 997,col 64)",
        "(line 999,col 9)-(line 999,col 63)",
        "(line 1000,col 9)-(line 1000,col 66)",
        "(line 1003,col 9)-(line 1003,col 44)",
        "(line 1004,col 9)-(line 1004,col 43)",
        "(line 1005,col 9)-(line 1005,col 78)",
        "(line 1007,col 9)-(line 1007,col 74)",
        "(line 1008,col 9)-(line 1008,col 41)",
        "(line 1009,col 9)-(line 1009,col 45)",
        "(line 1010,col 9)-(line 1010,col 82)",
        "(line 1013,col 9)-(line 1013,col 54)",
        "(line 1014,col 9)-(line 1014,col 51)",
        "(line 1015,col 9)-(line 1015,col 88)",
        "(line 1017,col 9)-(line 1017,col 51)",
        "(line 1018,col 9)-(line 1018,col 53)",
        "(line 1019,col 9)-(line 1019,col 92)",
        "(line 1022,col 9)-(line 1022,col 55)",
        "(line 1023,col 9)-(line 1023,col 53)",
        "(line 1024,col 9)-(line 1024,col 94)",
        "(line 1026,col 9)-(line 1026,col 59)",
        "(line 1027,col 9)-(line 1027,col 55)",
        "(line 1028,col 9)-(line 1028,col 98)",
        "(line 1031,col 9)-(line 1031,col 51)",
        "(line 1032,col 9)-(line 1032,col 56)",
        "(line 1033,col 9)-(line 1033,col 90)",
        "(line 1035,col 9)-(line 1035,col 55)",
        "(line 1036,col 9)-(line 1036,col 58)",
        "(line 1037,col 9)-(line 1037,col 94)",
        "(line 1040,col 9)-(line 1040,col 40)",
        "(line 1041,col 9)-(line 1041,col 46)",
        "(line 1044,col 9)-(line 1044,col 44)",
        "(line 1045,col 9)-(line 1045,col 48)",
        "(line 1047,col 9)-(line 1047,col 56)",
        "(line 1048,col 9)-(line 1048,col 70)",
        "(line 1050,col 9)-(line 1050,col 60)",
        "(line 1051,col 9)-(line 1051,col 72)",
        "(line 1053,col 9)-(line 1053,col 50)",
        "(line 1054,col 9)-(line 1054,col 63)",
        "(line 1055,col 9)-(line 1055,col 99)",
        "(line 1057,col 9)-(line 1064,col 9)",
        "(line 1066,col 9)-(line 1066,col 65)",
        "(line 1067,col 9)-(line 1067,col 28)",
        "(line 1068,col 9)-(line 1068,col 96)",
        "(line 1069,col 9)-(line 1076,col 9)",
        "(line 1078,col 9)-(line 1078,col 52)",
        "(line 1079,col 9)-(line 1079,col 96)",
        "(line 1080,col 9)-(line 1080,col 94)",
        "(line 1082,col 9)-(line 1082,col 56)",
        "(line 1083,col 9)-(line 1083,col 98)",
        "(line 1084,col 9)-(line 1084,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testMisc()",
      "begin_line": 1088,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 57)",
        "(line 1090,col 9)-(line 1090,col 57)",
        "(line 1091,col 9)-(line 1091,col 53)",
        "(line 1093,col 9)-(line 1093,col 36)",
        "(line 1094,col 9)-(line 1094,col 54)",
        "(line 1100,col 9)-(line 1107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testPredicates()",
      "begin_line": 1112,
      "end_line": 1139,
      "comment": "",
      "child_ranges": [
        "(line 1114,col 9)-(line 1114,col 76)",
        "(line 1116,col 9)-(line 1116,col 31)",
        "(line 1117,col 9)-(line 1117,col 34)",
        "(line 1118,col 9)-(line 1118,col 30)",
        "(line 1120,col 9)-(line 1120,col 36)",
        "(line 1121,col 9)-(line 1121,col 48)",
        "(line 1124,col 9)-(line 1124,col 25)",
        "(line 1125,col 9)-(line 1125,col 35)",
        "(line 1128,col 9)-(line 1128,col 25)",
        "(line 1129,col 9)-(line 1129,col 72)",
        "(line 1130,col 9)-(line 1130,col 86)",
        "(line 1131,col 9)-(line 1131,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 1142,
      "end_line": 1150,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1146,col 9)",
        "(line 1147,col 9)-(line 1149,col 9)"
      ]
    }
  ]
}