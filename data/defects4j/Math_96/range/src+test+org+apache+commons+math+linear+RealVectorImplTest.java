{
  "filepath": "/tmp/Math-96b/src/test/org/apache/commons/math/linear/RealVectorImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 1137,
      "comment": "\n * Test cases for the {@link RealVectorImpl} class.\n *\n * @version $Revision$ $Date$\n "
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
      "name": "RealVectorTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 413,
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
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.RealVectorTestImpl(double[])",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.unsupported()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.copy()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 68,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAdd(double)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAddToSelf(double)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSubtract(double)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSubtractToSelf(double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapMultiply(double)",
      "begin_line": 91,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 51)",
        "(line 93,col 13)-(line 95,col 13)",
        "(line 96,col 13)-(line 96,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapMultiplyToSelf(double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapDivide(double)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapDivideToSelf(double)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapPow(double)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 13)-(line 112,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapPowToSelf(double)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapExp()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapExpToSelf()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapExpm1()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapExpm1ToSelf()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapLog()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapLogToSelf()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapLog10()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapLog10ToSelf()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapLog1p()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapLog1pToSelf()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapCosh()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapCoshToSelf()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSinh()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSinhToSelf()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 172,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapTanh()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 13)-(line 176,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapTanhToSelf()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapCos()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapCosToSelf()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSin()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSinToSelf()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapTan()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 13)-(line 200,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapTanToSelf()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAcos()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAcosToSelf()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAsin()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAsinToSelf()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAtan()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAtanToSelf()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapInv()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapInvToSelf()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAbs()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapAbsToSelf()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSqrt()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSqrtToSelf()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapCbrt()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapCbrtToSelf()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapCeil()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapCeilToSelf()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapFloor()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapFloorToSelf()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapRint()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapRintToSelf()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSignum()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 13)-(line 288,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapSignumToSelf()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapUlp()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.mapUlpToSelf()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 13)-(line 300,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 303,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 304,col 13)-(line 304,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 13)-(line 308,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.getData()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 13)-(line 312,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 315,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 318,col 13)-(line 318,col 27)",
        "(line 319,col 13)-(line 321,col 13)",
        "(line 322,col 13)-(line 322,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.getNorm()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 13)-(line 326,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.getL1Norm()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.getLInfNorm()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 334,col 13)-(line 334,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 337,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.unitVector()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 350,col 13)-(line 350,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.unitize()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 354,col 13)-(line 354,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 13)-(line 362,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.getEntry(int)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 13)-(line 366,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.getDimension()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 13)-(line 374,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.append(double)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 13)-(line 378,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.append(double[])",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.get(int, int)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.set(int, double)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.set(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 394,col 13)-(line 394,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.set(double)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 398,col 13)-(line 398,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.toArray()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 13)-(line 402,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.isNaN()",
      "begin_line": 405,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 406,col 13)-(line 406,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl.isInfinite()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 410,col 13)-(line 410,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.suite()",
      "begin_line": 415,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 66)",
        "(line 417,col 9)-(line 417,col 46)",
        "(line 418,col 9)-(line 418,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.testConstructors()",
      "begin_line": 421,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 49)",
        "(line 424,col 9)-(line 424,col 59)",
        "(line 426,col 9)-(line 426,col 50)",
        "(line 427,col 9)-(line 427,col 59)",
        "(line 428,col 9)-(line 428,col 62)",
        "(line 430,col 9)-(line 430,col 56)",
        "(line 431,col 9)-(line 431,col 59)",
        "(line 432,col 9)-(line 432,col 64)",
        "(line 434,col 9)-(line 434,col 53)",
        "(line 435,col 9)-(line 435,col 59)",
        "(line 436,col 9)-(line 436,col 62)",
        "(line 438,col 9)-(line 438,col 59)",
        "(line 439,col 9)-(line 439,col 59)",
        "(line 440,col 9)-(line 440,col 62)",
        "(line 441,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 450,col 52)",
        "(line 451,col 9)-(line 451,col 61)",
        "(line 452,col 9)-(line 452,col 64)",
        "(line 454,col 9)-(line 454,col 54)",
        "(line 455,col 9)-(line 455,col 59)",
        "(line 456,col 9)-(line 456,col 62)",
        "(line 458,col 9)-(line 458,col 60)",
        "(line 459,col 9)-(line 459,col 59)",
        "(line 460,col 9)-(line 460,col 62)",
        "(line 461,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 470,col 51)",
        "(line 471,col 9)-(line 471,col 59)",
        "(line 472,col 9)-(line 472,col 62)",
        "(line 474,col 9)-(line 474,col 63)",
        "(line 476,col 9)-(line 476,col 55)",
        "(line 477,col 9)-(line 477,col 61)",
        "(line 478,col 9)-(line 478,col 65)",
        "(line 480,col 9)-(line 480,col 57)",
        "(line 481,col 9)-(line 481,col 59)",
        "(line 482,col 9)-(line 482,col 62)",
        "(line 483,col 9)-(line 483,col 69)",
        "(line 485,col 9)-(line 485,col 60)",
        "(line 486,col 9)-(line 486,col 61)",
        "(line 487,col 9)-(line 487,col 64)",
        "(line 488,col 9)-(line 488,col 66)",
        "(line 490,col 9)-(line 490,col 55)",
        "(line 491,col 9)-(line 491,col 60)",
        "(line 492,col 9)-(line 492,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.testDataInOut()",
      "begin_line": 496,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 53)",
        "(line 499,col 9)-(line 499,col 53)",
        "(line 500,col 9)-(line 500,col 53)",
        "(line 501,col 9)-(line 501,col 63)",
        "(line 503,col 9)-(line 503,col 46)",
        "(line 504,col 9)-(line 504,col 67)",
        "(line 505,col 9)-(line 505,col 70)",
        "(line 507,col 9)-(line 507,col 47)",
        "(line 508,col 9)-(line 508,col 67)",
        "(line 509,col 9)-(line 509,col 70)",
        "(line 511,col 9)-(line 511,col 48)",
        "(line 512,col 9)-(line 512,col 67)",
        "(line 513,col 9)-(line 513,col 67)",
        "(line 515,col 9)-(line 515,col 48)",
        "(line 516,col 9)-(line 516,col 67)",
        "(line 517,col 9)-(line 517,col 70)",
        "(line 519,col 9)-(line 519,col 38)",
        "(line 520,col 9)-(line 520,col 63)",
        "(line 521,col 9)-(line 521,col 78)",
        "(line 523,col 9)-(line 523,col 41)",
        "(line 524,col 9)-(line 524,col 57)",
        "(line 525,col 9)-(line 525,col 70)",
        "(line 533,col 9)-(line 533,col 40)",
        "(line 534,col 9)-(line 534,col 62)",
        "(line 535,col 9)-(line 535,col 65)",
        "(line 536,col 9)-(line 543,col 9)",
        "(line 545,col 9)-(line 545,col 59)",
        "(line 546,col 9)-(line 546,col 28)",
        "(line 547,col 9)-(line 547,col 68)",
        "(line 548,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 557,col 59)",
        "(line 558,col 9)-(line 558,col 26)",
        "(line 559,col 9)-(line 559,col 66)",
        "(line 560,col 9)-(line 560,col 66)",
        "(line 561,col 9)-(line 568,col 9)",
        "(line 570,col 9)-(line 570,col 59)",
        "(line 571,col 9)-(line 571,col 25)",
        "(line 572,col 9)-(line 572,col 68)",
        "(line 574,col 9)-(line 581,col 9)",
        "(line 583,col 9)-(line 583,col 59)",
        "(line 584,col 9)-(line 584,col 28)",
        "(line 585,col 9)-(line 585,col 66)",
        "(line 586,col 9)-(line 586,col 66)",
        "(line 587,col 9)-(line 594,col 9)",
        "(line 597,col 9)-(line 597,col 59)",
        "(line 598,col 9)-(line 598,col 61)",
        "(line 599,col 9)-(line 599,col 39)",
        "(line 600,col 9)-(line 600,col 29)",
        "(line 601,col 9)-(line 601,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.testMapFunctions()",
      "begin_line": 605,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 53)",
        "(line 609,col 9)-(line 609,col 46)",
        "(line 610,col 9)-(line 610,col 46)",
        "(line 611,col 9)-(line 611,col 87)",
        "(line 614,col 9)-(line 614,col 46)",
        "(line 615,col 9)-(line 615,col 42)",
        "(line 616,col 9)-(line 616,col 52)",
        "(line 617,col 9)-(line 617,col 99)",
        "(line 620,col 9)-(line 620,col 56)",
        "(line 621,col 9)-(line 621,col 52)",
        "(line 622,col 9)-(line 622,col 97)",
        "(line 625,col 9)-(line 625,col 51)",
        "(line 626,col 9)-(line 626,col 52)",
        "(line 627,col 9)-(line 627,col 58)",
        "(line 628,col 9)-(line 628,col 109)",
        "(line 631,col 9)-(line 631,col 56)",
        "(line 632,col 9)-(line 632,col 51)",
        "(line 633,col 9)-(line 633,col 97)",
        "(line 636,col 9)-(line 636,col 51)",
        "(line 637,col 9)-(line 637,col 52)",
        "(line 638,col 9)-(line 638,col 57)",
        "(line 639,col 9)-(line 639,col 109)",
        "(line 642,col 9)-(line 642,col 52)",
        "(line 643,col 9)-(line 643,col 52)",
        "(line 644,col 9)-(line 644,col 93)",
        "(line 647,col 9)-(line 647,col 49)",
        "(line 648,col 9)-(line 648,col 48)",
        "(line 649,col 9)-(line 649,col 58)",
        "(line 650,col 9)-(line 650,col 105)",
        "(line 653,col 9)-(line 653,col 46)",
        "(line 654,col 9)-(line 654,col 46)",
        "(line 655,col 9)-(line 655,col 87)",
        "(line 658,col 9)-(line 658,col 46)",
        "(line 659,col 9)-(line 659,col 42)",
        "(line 660,col 9)-(line 660,col 52)",
        "(line 661,col 9)-(line 661,col 99)",
        "(line 664,col 9)-(line 664,col 42)",
        "(line 665,col 9)-(line 665,col 105)",
        "(line 666,col 9)-(line 666,col 87)",
        "(line 669,col 9)-(line 669,col 46)",
        "(line 670,col 9)-(line 670,col 38)",
        "(line 671,col 9)-(line 671,col 111)",
        "(line 672,col 9)-(line 672,col 99)",
        "(line 676,col 9)-(line 676,col 46)",
        "(line 677,col 9)-(line 677,col 95)",
        "(line 678,col 9)-(line 678,col 91)",
        "(line 681,col 9)-(line 681,col 48)",
        "(line 682,col 9)-(line 682,col 42)",
        "(line 683,col 9)-(line 683,col 101)",
        "(line 684,col 9)-(line 684,col 103)",
        "(line 687,col 9)-(line 687,col 42)",
        "(line 688,col 9)-(line 688,col 85)",
        "(line 689,col 9)-(line 689,col 87)",
        "(line 692,col 9)-(line 692,col 46)",
        "(line 693,col 9)-(line 693,col 38)",
        "(line 694,col 9)-(line 694,col 91)",
        "(line 695,col 9)-(line 695,col 99)",
        "(line 698,col 9)-(line 698,col 46)",
        "(line 699,col 9)-(line 699,col 87)",
        "(line 700,col 9)-(line 700,col 91)",
        "(line 703,col 9)-(line 703,col 48)",
        "(line 704,col 9)-(line 704,col 42)",
        "(line 705,col 9)-(line 705,col 93)",
        "(line 706,col 9)-(line 706,col 103)",
        "(line 709,col 9)-(line 709,col 46)",
        "(line 710,col 9)-(line 710,col 97)",
        "(line 711,col 9)-(line 711,col 91)",
        "(line 714,col 9)-(line 714,col 48)",
        "(line 715,col 9)-(line 715,col 42)",
        "(line 716,col 9)-(line 716,col 103)",
        "(line 717,col 9)-(line 717,col 103)",
        "(line 720,col 9)-(line 720,col 44)",
        "(line 721,col 9)-(line 721,col 106)",
        "(line 722,col 9)-(line 722,col 89)",
        "(line 725,col 9)-(line 725,col 47)",
        "(line 726,col 9)-(line 726,col 40)",
        "(line 727,col 9)-(line 727,col 112)",
        "(line 728,col 9)-(line 728,col 101)",
        "(line 731,col 9)-(line 731,col 44)",
        "(line 732,col 9)-(line 732,col 106)",
        "(line 733,col 9)-(line 733,col 89)",
        "(line 736,col 9)-(line 736,col 47)",
        "(line 737,col 9)-(line 737,col 40)",
        "(line 738,col 9)-(line 738,col 112)",
        "(line 739,col 9)-(line 739,col 101)",
        "(line 742,col 9)-(line 742,col 44)",
        "(line 743,col 9)-(line 743,col 105)",
        "(line 744,col 9)-(line 744,col 89)",
        "(line 747,col 9)-(line 747,col 47)",
        "(line 748,col 9)-(line 748,col 40)",
        "(line 749,col 9)-(line 749,col 111)",
        "(line 750,col 9)-(line 750,col 101)",
        "(line 753,col 9)-(line 753,col 42)",
        "(line 754,col 9)-(line 754,col 107)",
        "(line 755,col 9)-(line 755,col 87)",
        "(line 758,col 9)-(line 758,col 46)",
        "(line 759,col 9)-(line 759,col 38)",
        "(line 760,col 9)-(line 760,col 113)",
        "(line 761,col 9)-(line 761,col 99)",
        "(line 764,col 9)-(line 764,col 42)",
        "(line 765,col 9)-(line 765,col 104)",
        "(line 766,col 9)-(line 766,col 87)",
        "(line 769,col 9)-(line 769,col 46)",
        "(line 770,col 9)-(line 770,col 38)",
        "(line 771,col 9)-(line 771,col 110)",
        "(line 772,col 9)-(line 772,col 99)",
        "(line 775,col 9)-(line 775,col 42)",
        "(line 776,col 9)-(line 776,col 106)",
        "(line 777,col 9)-(line 777,col 87)",
        "(line 780,col 9)-(line 780,col 46)",
        "(line 781,col 9)-(line 781,col 38)",
        "(line 782,col 9)-(line 782,col 112)",
        "(line 783,col 9)-(line 783,col 99)",
        "(line 785,col 9)-(line 785,col 42)",
        "(line 786,col 9)-(line 786,col 55)",
        "(line 789,col 9)-(line 789,col 45)",
        "(line 790,col 9)-(line 790,col 88)",
        "(line 791,col 9)-(line 791,col 89)",
        "(line 794,col 9)-(line 794,col 48)",
        "(line 795,col 9)-(line 795,col 40)",
        "(line 796,col 9)-(line 796,col 94)",
        "(line 797,col 9)-(line 797,col 101)",
        "(line 800,col 9)-(line 800,col 45)",
        "(line 801,col 9)-(line 801,col 87)",
        "(line 802,col 9)-(line 802,col 89)",
        "(line 805,col 9)-(line 805,col 48)",
        "(line 806,col 9)-(line 806,col 40)",
        "(line 807,col 9)-(line 807,col 93)",
        "(line 808,col 9)-(line 808,col 101)",
        "(line 811,col 9)-(line 811,col 45)",
        "(line 812,col 9)-(line 812,col 87)",
        "(line 813,col 9)-(line 813,col 89)",
        "(line 816,col 9)-(line 816,col 48)",
        "(line 817,col 9)-(line 817,col 40)",
        "(line 818,col 9)-(line 818,col 93)",
        "(line 819,col 9)-(line 819,col 101)",
        "(line 822,col 9)-(line 822,col 42)",
        "(line 823,col 9)-(line 823,col 66)",
        "(line 824,col 9)-(line 824,col 87)",
        "(line 827,col 9)-(line 827,col 46)",
        "(line 828,col 9)-(line 828,col 38)",
        "(line 829,col 9)-(line 829,col 72)",
        "(line 830,col 9)-(line 830,col 99)",
        "(line 832,col 9)-(line 832,col 45)",
        "(line 833,col 9)-(line 833,col 57)",
        "(line 836,col 9)-(line 836,col 45)",
        "(line 837,col 9)-(line 837,col 44)",
        "(line 838,col 9)-(line 838,col 87)",
        "(line 841,col 9)-(line 841,col 49)",
        "(line 842,col 9)-(line 842,col 38)",
        "(line 843,col 9)-(line 843,col 50)",
        "(line 844,col 9)-(line 844,col 99)",
        "(line 847,col 9)-(line 847,col 44)",
        "(line 848,col 9)-(line 848,col 85)",
        "(line 849,col 9)-(line 849,col 89)",
        "(line 852,col 9)-(line 852,col 47)",
        "(line 853,col 9)-(line 853,col 40)",
        "(line 854,col 9)-(line 854,col 91)",
        "(line 855,col 9)-(line 855,col 101)",
        "(line 857,col 9)-(line 857,col 46)",
        "(line 858,col 9)-(line 858,col 59)",
        "(line 861,col 9)-(line 861,col 48)",
        "(line 862,col 9)-(line 862,col 80)",
        "(line 863,col 9)-(line 863,col 89)",
        "(line 866,col 9)-(line 866,col 51)",
        "(line 867,col 9)-(line 867,col 40)",
        "(line 868,col 9)-(line 868,col 87)",
        "(line 869,col 9)-(line 869,col 101)",
        "(line 871,col 9)-(line 871,col 46)",
        "(line 872,col 9)-(line 872,col 59)",
        "(line 875,col 9)-(line 875,col 48)",
        "(line 876,col 9)-(line 876,col 46)",
        "(line 877,col 9)-(line 877,col 89)",
        "(line 880,col 9)-(line 880,col 51)",
        "(line 881,col 9)-(line 881,col 40)",
        "(line 882,col 9)-(line 882,col 53)",
        "(line 883,col 9)-(line 883,col 101)",
        "(line 886,col 9)-(line 886,col 50)",
        "(line 887,col 9)-(line 887,col 47)",
        "(line 888,col 9)-(line 888,col 91)",
        "(line 891,col 9)-(line 891,col 52)",
        "(line 892,col 9)-(line 892,col 42)",
        "(line 893,col 9)-(line 893,col 54)",
        "(line 894,col 9)-(line 894,col 103)",
        "(line 897,col 9)-(line 897,col 48)",
        "(line 898,col 9)-(line 898,col 46)",
        "(line 899,col 9)-(line 899,col 89)",
        "(line 902,col 9)-(line 902,col 51)",
        "(line 903,col 9)-(line 903,col 40)",
        "(line 904,col 9)-(line 904,col 53)",
        "(line 905,col 9)-(line 905,col 101)",
        "(line 908,col 9)-(line 908,col 52)",
        "(line 909,col 9)-(line 909,col 48)",
        "(line 910,col 9)-(line 910,col 93)",
        "(line 913,col 9)-(line 913,col 53)",
        "(line 914,col 9)-(line 914,col 44)",
        "(line 915,col 9)-(line 915,col 55)",
        "(line 916,col 9)-(line 916,col 105)",
        "(line 921,col 9)-(line 921,col 46)",
        "(line 922,col 9)-(line 922,col 105)",
        "(line 923,col 9)-(line 923,col 87)",
        "(line 926,col 9)-(line 926,col 50)",
        "(line 927,col 9)-(line 927,col 38)",
        "(line 928,col 9)-(line 928,col 111)",
        "(line 929,col 9)-(line 929,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.testBasicFunctions()",
      "begin_line": 933,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 53)",
        "(line 935,col 9)-(line 935,col 53)",
        "(line 936,col 9)-(line 936,col 61)",
        "(line 938,col 9)-(line 938,col 63)",
        "(line 941,col 9)-(line 941,col 40)",
        "(line 942,col 9)-(line 942,col 71)",
        "(line 944,col 9)-(line 944,col 44)",
        "(line 945,col 9)-(line 945,col 58)",
        "(line 947,col 9)-(line 947,col 48)",
        "(line 948,col 9)-(line 948,col 60)",
        "(line 951,col 9)-(line 951,col 41)",
        "(line 952,col 9)-(line 952,col 74)",
        "(line 955,col 9)-(line 955,col 45)",
        "(line 956,col 9)-(line 956,col 76)",
        "(line 959,col 9)-(line 959,col 55)",
        "(line 960,col 9)-(line 960,col 62)",
        "(line 962,col 9)-(line 962,col 59)",
        "(line 963,col 9)-(line 963,col 64)",
        "(line 966,col 9)-(line 966,col 59)",
        "(line 967,col 9)-(line 967,col 64)",
        "(line 969,col 9)-(line 969,col 63)",
        "(line 970,col 9)-(line 970,col 66)",
        "(line 973,col 9)-(line 973,col 42)",
        "(line 974,col 9)-(line 974,col 43)",
        "(line 975,col 9)-(line 975,col 78)",
        "(line 977,col 9)-(line 977,col 62)",
        "(line 978,col 9)-(line 978,col 41)",
        "(line 979,col 9)-(line 979,col 45)",
        "(line 980,col 9)-(line 980,col 82)",
        "(line 983,col 9)-(line 983,col 52)",
        "(line 984,col 9)-(line 984,col 51)",
        "(line 985,col 9)-(line 985,col 88)",
        "(line 987,col 9)-(line 987,col 51)",
        "(line 988,col 9)-(line 988,col 53)",
        "(line 989,col 9)-(line 989,col 92)",
        "(line 992,col 9)-(line 992,col 59)",
        "(line 993,col 9)-(line 993,col 53)",
        "(line 994,col 9)-(line 994,col 94)",
        "(line 996,col 9)-(line 996,col 59)",
        "(line 997,col 9)-(line 997,col 55)",
        "(line 998,col 9)-(line 998,col 98)",
        "(line 1001,col 9)-(line 1001,col 55)",
        "(line 1002,col 9)-(line 1002,col 56)",
        "(line 1003,col 9)-(line 1003,col 90)",
        "(line 1005,col 9)-(line 1005,col 55)",
        "(line 1006,col 9)-(line 1006,col 58)",
        "(line 1007,col 9)-(line 1007,col 94)",
        "(line 1010,col 9)-(line 1010,col 40)",
        "(line 1011,col 9)-(line 1011,col 46)",
        "(line 1014,col 9)-(line 1014,col 44)",
        "(line 1015,col 9)-(line 1015,col 48)",
        "(line 1017,col 9)-(line 1017,col 60)",
        "(line 1018,col 9)-(line 1018,col 70)",
        "(line 1020,col 9)-(line 1020,col 60)",
        "(line 1021,col 9)-(line 1021,col 72)",
        "(line 1023,col 9)-(line 1023,col 50)",
        "(line 1024,col 9)-(line 1024,col 63)",
        "(line 1025,col 9)-(line 1025,col 99)",
        "(line 1027,col 9)-(line 1034,col 9)",
        "(line 1036,col 9)-(line 1036,col 61)",
        "(line 1037,col 9)-(line 1037,col 28)",
        "(line 1038,col 9)-(line 1038,col 96)",
        "(line 1039,col 9)-(line 1046,col 9)",
        "(line 1048,col 9)-(line 1048,col 56)",
        "(line 1049,col 9)-(line 1049,col 96)",
        "(line 1050,col 9)-(line 1050,col 94)",
        "(line 1052,col 9)-(line 1052,col 56)",
        "(line 1053,col 9)-(line 1053,col 98)",
        "(line 1054,col 9)-(line 1054,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.testMisc()",
      "begin_line": 1058,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 53)",
        "(line 1060,col 9)-(line 1060,col 53)",
        "(line 1061,col 9)-(line 1061,col 51)",
        "(line 1063,col 9)-(line 1063,col 36)",
        "(line 1064,col 9)-(line 1064,col 54)",
        "(line 1070,col 9)-(line 1077,col 9)",
        "(line 1079,col 8)-(line 1086,col 9)",
        "(line 1088,col 9)-(line 1095,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.testPredicates()",
      "begin_line": 1099,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 72)",
        "(line 1103,col 9)-(line 1103,col 31)",
        "(line 1104,col 9)-(line 1104,col 29)",
        "(line 1105,col 9)-(line 1105,col 30)",
        "(line 1107,col 9)-(line 1107,col 36)",
        "(line 1108,col 9)-(line 1108,col 43)",
        "(line 1109,col 9)-(line 1109,col 36)",
        "(line 1110,col 9)-(line 1110,col 20)",
        "(line 1111,col 9)-(line 1111,col 35)",
        "(line 1113,col 9)-(line 1113,col 20)",
        "(line 1114,col 9)-(line 1114,col 70)",
        "(line 1115,col 9)-(line 1115,col 84)",
        "(line 1116,col 9)-(line 1116,col 74)",
        "(line 1118,col 9)-(line 1119,col 87)",
        "(line 1121,col 9)-(line 1122,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImplTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 1127,
      "end_line": 1135,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1131,col 9)",
        "(line 1132,col 9)-(line 1134,col 9)"
      ]
    }
  ]
}