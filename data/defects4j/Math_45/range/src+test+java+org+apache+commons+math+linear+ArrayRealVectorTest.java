{
  "filepath": "/tmp/Math-45b/src/test/java/org/apache/commons/math/linear/ArrayRealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVectorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 1378,
      "comment": "\n * Test cases for the {@link ArrayRealVector} class.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec5"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 77,
      "end_line": 77,
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
      "begin_line": 81,
      "end_line": 358,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.RealVectorTestImpl(double[])",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unsupported()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.iterator()",
      "begin_line": 106,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 128,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-a0d0e3f6-91cf-4146-9bf1-551dfbb7e26f.hasNext()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 21)-(line 110,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-79e78c66-e98e-4ace-9a42-c1d0c068b6f9.next()",
      "begin_line": 112,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 113,col 21)-(line 113,col 38)",
        "(line 114,col 21)-(line 123,col 22)",
        "(line 124,col 21)-(line 124,col 34)",
        "(line 125,col 21)-(line 125,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-973b8444-cbc0-4363-a995-71a4cb0104d5.getValue()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 29)-(line 117,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-56f893e4-ca56-4c78-b88e-e263da654c7b.setValue(double)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 29)-(line 121,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-9149746c-8ca4-4b2e-bc43-c89fceec1968.remove()",
      "begin_line": 127,
      "end_line": 127,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.sparseIterator()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.copy()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(double[])",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(double[])",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAdd(double)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAddToSelf(double)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtract(double)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtractToSelf(double)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiply(double)",
      "begin_line": 171,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 172,col 51)",
        "(line 173,col 13)-(line 175,col 13)",
        "(line 176,col 13)-(line 176,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiplyToSelf(double)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivide(double)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivideToSelf(double)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(double[])",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 13)-(line 200,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(double[])",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 207,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 27)",
        "(line 209,col 13)-(line 211,col 13)",
        "(line 212,col 13)-(line 212,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(double[])",
      "begin_line": 215,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 27)",
        "(line 217,col 13)-(line 219,col 13)",
        "(line 220,col 13)-(line 220,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.cosine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.cosine(double[])",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getNorm()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Norm()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfNorm()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(double[])",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(double[])",
      "begin_line": 255,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(double[])",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitVector()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitize()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(double[])",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(double[])",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 13)-(line 288,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getEntry(int)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDimension()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 299,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 13)-(line 300,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double)",
      "begin_line": 303,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 304,col 13)-(line 304,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double[])",
      "begin_line": 307,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 13)-(line 308,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 311,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 13)-(line 312,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setEntry(int, double)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, double[])",
      "begin_line": 323,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.set(double)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 328,col 13)-(line 328,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.toArray()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 332,col 13)-(line 332,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isNaN()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 336,col 13)-(line 336,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isInfinite()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 13)-(line 340,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combine(double, double, double[])",
      "begin_line": 343,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 344,col 13)-(line 344,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combineToSelf(double, double, double[])",
      "begin_line": 351,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testConstructors()",
      "begin_line": 360,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 51)",
        "(line 364,col 9)-(line 364,col 66)",
        "(line 366,col 9)-(line 366,col 52)",
        "(line 367,col 9)-(line 367,col 66)",
        "(line 368,col 9)-(line 368,col 72)",
        "(line 370,col 9)-(line 370,col 58)",
        "(line 371,col 9)-(line 371,col 66)",
        "(line 372,col 9)-(line 372,col 74)",
        "(line 374,col 9)-(line 374,col 55)",
        "(line 375,col 9)-(line 375,col 66)",
        "(line 376,col 9)-(line 376,col 72)",
        "(line 378,col 9)-(line 378,col 65)",
        "(line 379,col 9)-(line 379,col 70)",
        "(line 380,col 9)-(line 380,col 76)",
        "(line 381,col 9)-(line 381,col 56)",
        "(line 382,col 9)-(line 382,col 53)",
        "(line 384,col 9)-(line 384,col 66)",
        "(line 385,col 9)-(line 385,col 70)",
        "(line 386,col 9)-(line 386,col 76)",
        "(line 387,col 9)-(line 387,col 53)",
        "(line 388,col 9)-(line 388,col 53)",
        "(line 390,col 9)-(line 390,col 61)",
        "(line 391,col 9)-(line 391,col 66)",
        "(line 392,col 9)-(line 392,col 72)",
        "(line 393,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 400,col 53)",
        "(line 401,col 9)-(line 401,col 68)",
        "(line 402,col 9)-(line 402,col 74)",
        "(line 404,col 9)-(line 404,col 56)",
        "(line 405,col 9)-(line 405,col 66)",
        "(line 406,col 9)-(line 406,col 72)",
        "(line 408,col 9)-(line 408,col 62)",
        "(line 409,col 9)-(line 409,col 66)",
        "(line 410,col 9)-(line 410,col 72)",
        "(line 411,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 53)",
        "(line 419,col 9)-(line 419,col 66)",
        "(line 420,col 9)-(line 420,col 72)",
        "(line 422,col 9)-(line 422,col 63)",
        "(line 424,col 9)-(line 424,col 57)",
        "(line 425,col 9)-(line 425,col 68)",
        "(line 426,col 9)-(line 426,col 75)",
        "(line 428,col 9)-(line 428,col 59)",
        "(line 429,col 9)-(line 429,col 66)",
        "(line 430,col 9)-(line 430,col 72)",
        "(line 431,col 9)-(line 431,col 76)",
        "(line 433,col 9)-(line 433,col 62)",
        "(line 434,col 9)-(line 434,col 68)",
        "(line 435,col 9)-(line 435,col 74)",
        "(line 436,col 9)-(line 436,col 73)",
        "(line 438,col 9)-(line 438,col 57)",
        "(line 439,col 9)-(line 439,col 67)",
        "(line 440,col 9)-(line 440,col 72)",
        "(line 442,col 9)-(line 442,col 84)",
        "(line 443,col 9)-(line 443,col 67)",
        "(line 444,col 9)-(line 444,col 75)",
        "(line 445,col 9)-(line 445,col 73)",
        "(line 447,col 9)-(line 447,col 84)",
        "(line 448,col 9)-(line 448,col 67)",
        "(line 449,col 9)-(line 449,col 73)",
        "(line 450,col 9)-(line 450,col 75)",
        "(line 452,col 9)-(line 452,col 60)",
        "(line 453,col 9)-(line 453,col 67)",
        "(line 454,col 9)-(line 454,col 75)",
        "(line 455,col 9)-(line 455,col 73)",
        "(line 457,col 9)-(line 457,col 60)",
        "(line 458,col 9)-(line 458,col 67)",
        "(line 459,col 9)-(line 459,col 73)",
        "(line 460,col 9)-(line 460,col 75)",
        "(line 462,col 9)-(line 462,col 62)",
        "(line 463,col 9)-(line 463,col 68)",
        "(line 464,col 9)-(line 464,col 73)",
        "(line 465,col 9)-(line 465,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testDataInOut()",
      "begin_line": 469,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 55)",
        "(line 473,col 9)-(line 473,col 55)",
        "(line 474,col 9)-(line 474,col 55)",
        "(line 475,col 9)-(line 475,col 63)",
        "(line 477,col 9)-(line 477,col 46)",
        "(line 478,col 9)-(line 478,col 74)",
        "(line 479,col 9)-(line 479,col 80)",
        "(line 481,col 9)-(line 481,col 47)",
        "(line 482,col 9)-(line 482,col 74)",
        "(line 483,col 9)-(line 483,col 80)",
        "(line 485,col 9)-(line 485,col 48)",
        "(line 486,col 9)-(line 486,col 74)",
        "(line 487,col 9)-(line 487,col 80)",
        "(line 489,col 9)-(line 489,col 59)",
        "(line 490,col 9)-(line 490,col 74)",
        "(line 491,col 9)-(line 491,col 80)",
        "(line 493,col 9)-(line 493,col 38)",
        "(line 494,col 9)-(line 494,col 70)",
        "(line 495,col 9)-(line 495,col 85)",
        "(line 497,col 9)-(line 497,col 41)",
        "(line 498,col 9)-(line 498,col 64)",
        "(line 499,col 9)-(line 499,col 77)",
        "(line 507,col 9)-(line 507,col 49)",
        "(line 508,col 9)-(line 508,col 69)",
        "(line 509,col 9)-(line 509,col 75)",
        "(line 510,col 9)-(line 515,col 9)",
        "(line 517,col 9)-(line 517,col 43)",
        "(line 518,col 9)-(line 518,col 33)",
        "(line 519,col 9)-(line 519,col 78)",
        "(line 520,col 9)-(line 525,col 9)",
        "(line 527,col 9)-(line 527,col 43)",
        "(line 528,col 9)-(line 528,col 25)",
        "(line 529,col 9)-(line 529,col 78)",
        "(line 531,col 9)-(line 536,col 9)",
        "(line 538,col 9)-(line 538,col 43)",
        "(line 539,col 9)-(line 539,col 37)",
        "(line 540,col 9)-(line 540,col 76)",
        "(line 541,col 9)-(line 541,col 76)",
        "(line 542,col 9)-(line 547,col 9)",
        "(line 550,col 9)-(line 550,col 43)",
        "(line 551,col 9)-(line 551,col 45)",
        "(line 552,col 9)-(line 552,col 46)",
        "(line 553,col 9)-(line 553,col 34)",
        "(line 554,col 9)-(line 554,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMapFunctions()",
      "begin_line": 558,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 55)",
        "(line 563,col 9)-(line 563,col 46)",
        "(line 564,col 9)-(line 564,col 46)",
        "(line 565,col 9)-(line 565,col 87)",
        "(line 568,col 9)-(line 568,col 46)",
        "(line 569,col 9)-(line 569,col 42)",
        "(line 570,col 9)-(line 570,col 52)",
        "(line 571,col 9)-(line 571,col 99)",
        "(line 574,col 9)-(line 574,col 56)",
        "(line 575,col 9)-(line 575,col 52)",
        "(line 576,col 9)-(line 576,col 97)",
        "(line 579,col 9)-(line 579,col 51)",
        "(line 580,col 9)-(line 580,col 52)",
        "(line 581,col 9)-(line 581,col 58)",
        "(line 582,col 9)-(line 582,col 109)",
        "(line 585,col 9)-(line 585,col 56)",
        "(line 586,col 9)-(line 586,col 51)",
        "(line 587,col 9)-(line 587,col 97)",
        "(line 590,col 9)-(line 590,col 51)",
        "(line 591,col 9)-(line 591,col 52)",
        "(line 592,col 9)-(line 592,col 57)",
        "(line 593,col 9)-(line 593,col 109)",
        "(line 596,col 9)-(line 596,col 52)",
        "(line 597,col 9)-(line 597,col 52)",
        "(line 598,col 9)-(line 598,col 93)",
        "(line 601,col 9)-(line 601,col 49)",
        "(line 602,col 9)-(line 602,col 48)",
        "(line 603,col 9)-(line 603,col 58)",
        "(line 604,col 9)-(line 604,col 105)",
        "(line 607,col 9)-(line 607,col 51)",
        "(line 608,col 9)-(line 608,col 46)",
        "(line 609,col 9)-(line 609,col 87)",
        "(line 612,col 9)-(line 612,col 46)",
        "(line 613,col 9)-(line 613,col 47)",
        "(line 614,col 9)-(line 614,col 52)",
        "(line 615,col 9)-(line 615,col 99)",
        "(line 618,col 9)-(line 618,col 48)",
        "(line 619,col 9)-(line 619,col 105)",
        "(line 620,col 9)-(line 620,col 87)",
        "(line 623,col 9)-(line 623,col 46)",
        "(line 624,col 9)-(line 624,col 44)",
        "(line 625,col 9)-(line 625,col 111)",
        "(line 626,col 9)-(line 626,col 99)",
        "(line 630,col 9)-(line 630,col 52)",
        "(line 631,col 9)-(line 631,col 95)",
        "(line 632,col 9)-(line 632,col 91)",
        "(line 635,col 9)-(line 635,col 48)",
        "(line 636,col 9)-(line 636,col 48)",
        "(line 637,col 9)-(line 637,col 101)",
        "(line 638,col 9)-(line 638,col 103)",
        "(line 641,col 9)-(line 641,col 48)",
        "(line 642,col 9)-(line 642,col 85)",
        "(line 643,col 9)-(line 643,col 87)",
        "(line 646,col 9)-(line 646,col 46)",
        "(line 647,col 9)-(line 647,col 44)",
        "(line 648,col 9)-(line 648,col 91)",
        "(line 649,col 9)-(line 649,col 99)",
        "(line 652,col 9)-(line 652,col 52)",
        "(line 653,col 9)-(line 653,col 87)",
        "(line 654,col 9)-(line 654,col 91)",
        "(line 657,col 9)-(line 657,col 48)",
        "(line 658,col 9)-(line 658,col 48)",
        "(line 659,col 9)-(line 659,col 93)",
        "(line 660,col 9)-(line 660,col 103)",
        "(line 663,col 9)-(line 663,col 52)",
        "(line 664,col 9)-(line 664,col 97)",
        "(line 665,col 9)-(line 665,col 91)",
        "(line 668,col 9)-(line 668,col 48)",
        "(line 669,col 9)-(line 669,col 48)",
        "(line 670,col 9)-(line 670,col 103)",
        "(line 671,col 9)-(line 671,col 103)",
        "(line 674,col 9)-(line 674,col 50)",
        "(line 675,col 9)-(line 675,col 106)",
        "(line 676,col 9)-(line 676,col 89)",
        "(line 679,col 9)-(line 679,col 47)",
        "(line 680,col 9)-(line 680,col 46)",
        "(line 681,col 9)-(line 681,col 112)",
        "(line 682,col 9)-(line 682,col 101)",
        "(line 685,col 9)-(line 685,col 50)",
        "(line 686,col 9)-(line 686,col 106)",
        "(line 687,col 9)-(line 687,col 89)",
        "(line 690,col 9)-(line 690,col 47)",
        "(line 691,col 9)-(line 691,col 46)",
        "(line 692,col 9)-(line 692,col 112)",
        "(line 693,col 9)-(line 693,col 101)",
        "(line 696,col 9)-(line 696,col 50)",
        "(line 697,col 9)-(line 697,col 105)",
        "(line 698,col 9)-(line 698,col 89)",
        "(line 701,col 9)-(line 701,col 47)",
        "(line 702,col 9)-(line 702,col 46)",
        "(line 703,col 9)-(line 703,col 111)",
        "(line 704,col 9)-(line 704,col 101)",
        "(line 707,col 9)-(line 707,col 48)",
        "(line 708,col 9)-(line 708,col 107)",
        "(line 709,col 9)-(line 709,col 87)",
        "(line 712,col 9)-(line 712,col 46)",
        "(line 713,col 9)-(line 713,col 44)",
        "(line 714,col 9)-(line 714,col 113)",
        "(line 715,col 9)-(line 715,col 99)",
        "(line 718,col 9)-(line 718,col 48)",
        "(line 719,col 9)-(line 719,col 104)",
        "(line 720,col 9)-(line 720,col 87)",
        "(line 723,col 9)-(line 723,col 46)",
        "(line 724,col 9)-(line 724,col 44)",
        "(line 725,col 9)-(line 725,col 110)",
        "(line 726,col 9)-(line 726,col 99)",
        "(line 729,col 9)-(line 729,col 48)",
        "(line 730,col 9)-(line 730,col 106)",
        "(line 731,col 9)-(line 731,col 87)",
        "(line 734,col 9)-(line 734,col 46)",
        "(line 735,col 9)-(line 735,col 44)",
        "(line 736,col 9)-(line 736,col 112)",
        "(line 737,col 9)-(line 737,col 99)",
        "(line 739,col 9)-(line 739,col 42)",
        "(line 740,col 9)-(line 740,col 57)",
        "(line 743,col 9)-(line 743,col 51)",
        "(line 744,col 9)-(line 744,col 88)",
        "(line 745,col 9)-(line 745,col 89)",
        "(line 748,col 9)-(line 748,col 48)",
        "(line 749,col 9)-(line 749,col 46)",
        "(line 750,col 9)-(line 750,col 94)",
        "(line 751,col 9)-(line 751,col 101)",
        "(line 754,col 9)-(line 754,col 51)",
        "(line 755,col 9)-(line 755,col 87)",
        "(line 756,col 9)-(line 756,col 89)",
        "(line 759,col 9)-(line 759,col 48)",
        "(line 760,col 9)-(line 760,col 46)",
        "(line 761,col 9)-(line 761,col 93)",
        "(line 762,col 9)-(line 762,col 101)",
        "(line 765,col 9)-(line 765,col 51)",
        "(line 766,col 9)-(line 766,col 87)",
        "(line 767,col 9)-(line 767,col 89)",
        "(line 770,col 9)-(line 770,col 48)",
        "(line 771,col 9)-(line 771,col 46)",
        "(line 772,col 9)-(line 772,col 93)",
        "(line 773,col 9)-(line 773,col 101)",
        "(line 776,col 9)-(line 776,col 52)",
        "(line 777,col 9)-(line 777,col 66)",
        "(line 778,col 9)-(line 778,col 87)",
        "(line 781,col 9)-(line 781,col 46)",
        "(line 782,col 9)-(line 782,col 48)",
        "(line 783,col 9)-(line 783,col 72)",
        "(line 784,col 9)-(line 784,col 99)",
        "(line 786,col 9)-(line 786,col 45)",
        "(line 787,col 9)-(line 787,col 59)",
        "(line 790,col 9)-(line 790,col 51)",
        "(line 791,col 9)-(line 791,col 44)",
        "(line 792,col 9)-(line 792,col 87)",
        "(line 795,col 9)-(line 795,col 49)",
        "(line 796,col 9)-(line 796,col 44)",
        "(line 797,col 9)-(line 797,col 50)",
        "(line 798,col 9)-(line 798,col 99)",
        "(line 801,col 9)-(line 801,col 50)",
        "(line 802,col 9)-(line 802,col 85)",
        "(line 803,col 9)-(line 803,col 89)",
        "(line 806,col 9)-(line 806,col 47)",
        "(line 807,col 9)-(line 807,col 46)",
        "(line 808,col 9)-(line 808,col 91)",
        "(line 809,col 9)-(line 809,col 101)",
        "(line 811,col 9)-(line 811,col 46)",
        "(line 812,col 9)-(line 812,col 61)",
        "(line 815,col 9)-(line 815,col 54)",
        "(line 816,col 9)-(line 816,col 80)",
        "(line 817,col 9)-(line 817,col 89)",
        "(line 820,col 9)-(line 820,col 51)",
        "(line 821,col 9)-(line 821,col 46)",
        "(line 822,col 9)-(line 822,col 87)",
        "(line 823,col 9)-(line 823,col 101)",
        "(line 825,col 9)-(line 825,col 46)",
        "(line 826,col 9)-(line 826,col 61)",
        "(line 829,col 9)-(line 829,col 54)",
        "(line 830,col 9)-(line 830,col 46)",
        "(line 831,col 9)-(line 831,col 89)",
        "(line 834,col 9)-(line 834,col 51)",
        "(line 835,col 9)-(line 835,col 46)",
        "(line 836,col 9)-(line 836,col 53)",
        "(line 837,col 9)-(line 837,col 101)",
        "(line 840,col 9)-(line 840,col 56)",
        "(line 841,col 9)-(line 841,col 47)",
        "(line 842,col 9)-(line 842,col 91)",
        "(line 845,col 9)-(line 845,col 52)",
        "(line 846,col 9)-(line 846,col 48)",
        "(line 847,col 9)-(line 847,col 54)",
        "(line 848,col 9)-(line 848,col 103)",
        "(line 851,col 9)-(line 851,col 54)",
        "(line 852,col 9)-(line 852,col 46)",
        "(line 853,col 9)-(line 853,col 89)",
        "(line 856,col 9)-(line 856,col 51)",
        "(line 857,col 9)-(line 857,col 46)",
        "(line 858,col 9)-(line 858,col 53)",
        "(line 859,col 9)-(line 859,col 101)",
        "(line 862,col 9)-(line 862,col 58)",
        "(line 863,col 9)-(line 863,col 48)",
        "(line 864,col 9)-(line 864,col 93)",
        "(line 867,col 9)-(line 867,col 53)",
        "(line 868,col 9)-(line 868,col 50)",
        "(line 869,col 9)-(line 869,col 55)",
        "(line 870,col 9)-(line 870,col 105)",
        "(line 875,col 9)-(line 875,col 52)",
        "(line 876,col 9)-(line 876,col 105)",
        "(line 877,col 9)-(line 877,col 87)",
        "(line 880,col 9)-(line 880,col 50)",
        "(line 881,col 9)-(line 881,col 44)",
        "(line 882,col 9)-(line 882,col 111)",
        "(line 883,col 9)-(line 883,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testBasicFunctions()",
      "begin_line": 886,
      "end_line": 1030,
      "comment": "",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 55)",
        "(line 889,col 9)-(line 889,col 55)",
        "(line 890,col 9)-(line 890,col 55)",
        "(line 891,col 9)-(line 891,col 63)",
        "(line 893,col 9)-(line 893,col 63)",
        "(line 896,col 9)-(line 896,col 40)",
        "(line 897,col 9)-(line 897,col 97)",
        "(line 900,col 9)-(line 900,col 44)",
        "(line 901,col 9)-(line 901,col 82)",
        "(line 904,col 9)-(line 904,col 48)",
        "(line 905,col 9)-(line 905,col 83)",
        "(line 909,col 9)-(line 909,col 41)",
        "(line 910,col 9)-(line 910,col 95)",
        "(line 913,col 9)-(line 913,col 45)",
        "(line 914,col 9)-(line 914,col 97)",
        "(line 917,col 9)-(line 917,col 56)",
        "(line 918,col 9)-(line 918,col 97)",
        "(line 921,col 9)-(line 921,col 55)",
        "(line 922,col 9)-(line 922,col 84)",
        "(line 924,col 9)-(line 924,col 58)",
        "(line 925,col 9)-(line 925,col 86)",
        "(line 927,col 9)-(line 927,col 69)",
        "(line 928,col 9)-(line 928,col 86)",
        "(line 931,col 9)-(line 931,col 58)",
        "(line 932,col 9)-(line 932,col 86)",
        "(line 934,col 9)-(line 934,col 63)",
        "(line 935,col 9)-(line 935,col 88)",
        "(line 937,col 9)-(line 937,col 74)",
        "(line 938,col 9)-(line 938,col 88)",
        "(line 941,col 9)-(line 941,col 43)",
        "(line 942,col 9)-(line 942,col 43)",
        "(line 943,col 9)-(line 943,col 80)",
        "(line 945,col 9)-(line 945,col 62)",
        "(line 946,col 9)-(line 946,col 41)",
        "(line 947,col 9)-(line 947,col 45)",
        "(line 948,col 9)-(line 948,col 82)",
        "(line 951,col 9)-(line 951,col 53)",
        "(line 952,col 9)-(line 952,col 51)",
        "(line 953,col 9)-(line 953,col 88)",
        "(line 955,col 9)-(line 955,col 51)",
        "(line 956,col 9)-(line 956,col 53)",
        "(line 957,col 9)-(line 957,col 92)",
        "(line 960,col 9)-(line 960,col 60)",
        "(line 961,col 9)-(line 961,col 53)",
        "(line 962,col 9)-(line 962,col 94)",
        "(line 964,col 9)-(line 964,col 59)",
        "(line 965,col 9)-(line 965,col 55)",
        "(line 966,col 9)-(line 966,col 98)",
        "(line 968,col 9)-(line 968,col 70)",
        "(line 969,col 9)-(line 969,col 55)",
        "(line 970,col 9)-(line 970,col 98)",
        "(line 973,col 9)-(line 973,col 56)",
        "(line 974,col 9)-(line 974,col 56)",
        "(line 975,col 9)-(line 975,col 90)",
        "(line 977,col 9)-(line 977,col 55)",
        "(line 978,col 9)-(line 978,col 58)",
        "(line 979,col 9)-(line 979,col 94)",
        "(line 981,col 9)-(line 981,col 66)",
        "(line 982,col 9)-(line 982,col 58)",
        "(line 983,col 9)-(line 983,col 94)",
        "(line 986,col 9)-(line 986,col 40)",
        "(line 987,col 9)-(line 987,col 68)",
        "(line 990,col 9)-(line 990,col 44)",
        "(line 991,col 9)-(line 991,col 70)",
        "(line 993,col 9)-(line 993,col 56)",
        "(line 994,col 9)-(line 994,col 92)",
        "(line 996,col 9)-(line 996,col 60)",
        "(line 997,col 9)-(line 997,col 94)",
        "(line 999,col 9)-(line 999,col 71)",
        "(line 1000,col 9)-(line 1000,col 94)",
        "(line 1002,col 9)-(line 1002,col 50)",
        "(line 1003,col 9)-(line 1003,col 63)",
        "(line 1004,col 9)-(line 1004,col 99)",
        "(line 1006,col 9)-(line 1011,col 9)",
        "(line 1013,col 9)-(line 1013,col 46)",
        "(line 1014,col 9)-(line 1014,col 28)",
        "(line 1015,col 9)-(line 1015,col 96)",
        "(line 1016,col 9)-(line 1021,col 9)",
        "(line 1023,col 9)-(line 1023,col 52)",
        "(line 1024,col 9)-(line 1024,col 96)",
        "(line 1025,col 9)-(line 1025,col 94)",
        "(line 1027,col 9)-(line 1027,col 56)",
        "(line 1028,col 9)-(line 1028,col 98)",
        "(line 1029,col 9)-(line 1029,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMisc()",
      "begin_line": 1032,
      "end_line": 1066,
      "comment": "",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 55)",
        "(line 1035,col 9)-(line 1035,col 55)",
        "(line 1036,col 9)-(line 1036,col 52)",
        "(line 1038,col 9)-(line 1038,col 36)",
        "(line 1039,col 9)-(line 1039,col 61)",
        "(line 1045,col 9)-(line 1050,col 9)",
        "(line 1052,col 8)-(line 1057,col 9)",
        "(line 1059,col 9)-(line 1064,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testPredicates()",
      "begin_line": 1068,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 74)",
        "(line 1073,col 9)-(line 1073,col 38)",
        "(line 1074,col 9)-(line 1074,col 34)",
        "(line 1075,col 9)-(line 1075,col 37)",
        "(line 1077,col 9)-(line 1077,col 43)",
        "(line 1078,col 9)-(line 1078,col 48)",
        "(line 1079,col 9)-(line 1079,col 43)",
        "(line 1080,col 9)-(line 1080,col 25)",
        "(line 1081,col 9)-(line 1081,col 42)",
        "(line 1082,col 9)-(line 1082,col 25)",
        "(line 1083,col 9)-(line 1083,col 43)",
        "(line 1085,col 9)-(line 1085,col 25)",
        "(line 1086,col 9)-(line 1086,col 78)",
        "(line 1087,col 9)-(line 1087,col 96)",
        "(line 1088,col 9)-(line 1088,col 82)",
        "(line 1090,col 9)-(line 1091,col 88)",
        "(line 1093,col 9)-(line 1094,col 77)",
        "(line 1096,col 9)-(line 1096,col 39)",
        "(line 1097,col 9)-(line 1097,col 46)",
        "(line 1098,col 9)-(line 1098,col 43)",
        "(line 1099,col 9)-(line 1099,col 53)",
        "(line 1100,col 9)-(line 1100,col 78)",
        "(line 1101,col 9)-(line 1101,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testSerial()",
      "begin_line": 1105,
      "end_line": 1109,
      "comment": "",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 74)",
        "(line 1108,col 9)-(line 1108,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testZeroVectors()",
      "begin_line": 1111,
      "end_line": 1116,
      "comment": "",
      "child_ranges": [
        "(line 1113,col 9)-(line 1113,col 82)",
        "(line 1114,col 9)-(line 1114,col 88)",
        "(line 1115,col 9)-(line 1115,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMinMax()",
      "begin_line": 1118,
      "end_line": 1140,
      "comment": "",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 83)",
        "(line 1121,col 9)-(line 1121,col 50)",
        "(line 1122,col 9)-(line 1122,col 59)",
        "(line 1123,col 9)-(line 1123,col 50)",
        "(line 1124,col 9)-(line 1124,col 59)",
        "(line 1125,col 9)-(line 1125,col 97)",
        "(line 1126,col 9)-(line 1126,col 50)",
        "(line 1127,col 9)-(line 1127,col 59)",
        "(line 1128,col 9)-(line 1128,col 50)",
        "(line 1129,col 9)-(line 1129,col 58)",
        "(line 1130,col 9)-(line 1130,col 90)",
        "(line 1131,col 9)-(line 1131,col 51)",
        "(line 1132,col 9)-(line 1132,col 58)",
        "(line 1133,col 9)-(line 1133,col 51)",
        "(line 1134,col 9)-(line 1134,col 58)",
        "(line 1135,col 9)-(line 1135,col 64)",
        "(line 1136,col 9)-(line 1136,col 51)",
        "(line 1137,col 9)-(line 1137,col 58)",
        "(line 1138,col 9)-(line 1138,col 51)",
        "(line 1139,col 9)-(line 1139,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosine()",
      "begin_line": 1142,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1144,col 9)-(line 1144,col 78)",
        "(line 1146,col 9)-(line 1146,col 48)",
        "(line 1147,col 9)-(line 1147,col 50)",
        "(line 1148,col 9)-(line 1148,col 78)",
        "(line 1150,col 9)-(line 1150,col 39)",
        "(line 1151,col 9)-(line 1151,col 39)",
        "(line 1152,col 9)-(line 1152,col 59)",
        "(line 1154,col 9)-(line 1154,col 39)",
        "(line 1155,col 9)-(line 1155,col 39)",
        "(line 1156,col 9)-(line 1156,col 47)",
        "(line 1158,col 9)-(line 1158,col 40)",
        "(line 1159,col 9)-(line 1159,col 39)",
        "(line 1160,col 9)-(line 1160,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosinePrecondition1()",
      "begin_line": 1163,
      "end_line": 1168,
      "comment": "",
      "child_ranges": [
        "(line 1165,col 9)-(line 1165,col 78)",
        "(line 1166,col 9)-(line 1166,col 78)",
        "(line 1167,col 9)-(line 1167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosinePrecondition2()",
      "begin_line": 1169,
      "end_line": 1174,
      "comment": "",
      "child_ranges": [
        "(line 1171,col 9)-(line 1171,col 78)",
        "(line 1172,col 9)-(line 1172,col 78)",
        "(line 1173,col 9)-(line 1173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosinePrecondition3()",
      "begin_line": 1175,
      "end_line": 1180,
      "comment": "",
      "child_ranges": [
        "(line 1177,col 9)-(line 1177,col 78)",
        "(line 1178,col 9)-(line 1178,col 81)",
        "(line 1179,col 9)-(line 1179,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testOuterProduct()",
      "begin_line": 1182,
      "end_line": 1196,
      "comment": "",
      "child_ranges": [
        "(line 1184,col 9)-(line 1184,col 79)",
        "(line 1185,col 9)-(line 1185,col 76)",
        "(line 1187,col 9)-(line 1187,col 48)",
        "(line 1189,col 9)-(line 1189,col 40)",
        "(line 1190,col 9)-(line 1190,col 55)",
        "(line 1191,col 9)-(line 1191,col 56)",
        "(line 1192,col 9)-(line 1192,col 55)",
        "(line 1193,col 9)-(line 1193,col 56)",
        "(line 1194,col 9)-(line 1194,col 57)",
        "(line 1195,col 9)-(line 1195,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombinePreconditionSameType()",
      "begin_line": 1198,
      "end_line": 1207,
      "comment": "",
      "child_ranges": [
        "(line 1200,col 9)-(line 1200,col 28)",
        "(line 1201,col 9)-(line 1201,col 28)",
        "(line 1202,col 9)-(line 1202,col 51)",
        "(line 1203,col 9)-(line 1203,col 61)",
        "(line 1204,col 9)-(line 1204,col 38)",
        "(line 1205,col 9)-(line 1205,col 61)",
        "(line 1206,col 9)-(line 1206,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineSameType()",
      "begin_line": 1209,
      "end_line": 1238,
      "comment": "",
      "child_ranges": [
        "(line 1211,col 9)-(line 1211,col 51)",
        "(line 1212,col 9)-(line 1212,col 27)",
        "(line 1213,col 9)-(line 1213,col 55)",
        "(line 1214,col 9)-(line 1214,col 55)",
        "(line 1215,col 9)-(line 1215,col 54)",
        "(line 1216,col 9)-(line 1216,col 54)",
        "(line 1217,col 9)-(line 1217,col 50)",
        "(line 1218,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1225,col 61)",
        "(line 1226,col 9)-(line 1237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombinePreconditionMixedType()",
      "begin_line": 1240,
      "end_line": 1249,
      "comment": "",
      "child_ranges": [
        "(line 1242,col 9)-(line 1242,col 28)",
        "(line 1243,col 9)-(line 1243,col 28)",
        "(line 1244,col 9)-(line 1244,col 51)",
        "(line 1245,col 9)-(line 1245,col 61)",
        "(line 1246,col 9)-(line 1246,col 38)",
        "(line 1247,col 9)-(line 1247,col 56)",
        "(line 1248,col 9)-(line 1248,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineMixedTypes()",
      "begin_line": 1251,
      "end_line": 1280,
      "comment": "",
      "child_ranges": [
        "(line 1253,col 9)-(line 1253,col 51)",
        "(line 1254,col 9)-(line 1254,col 27)",
        "(line 1255,col 9)-(line 1255,col 55)",
        "(line 1256,col 9)-(line 1256,col 55)",
        "(line 1257,col 9)-(line 1257,col 54)",
        "(line 1258,col 9)-(line 1258,col 60)",
        "(line 1259,col 9)-(line 1259,col 50)",
        "(line 1260,col 9)-(line 1266,col 9)",
        "(line 1267,col 9)-(line 1267,col 61)",
        "(line 1268,col 9)-(line 1279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfPreconditionSameType()",
      "begin_line": 1282,
      "end_line": 1291,
      "comment": "",
      "child_ranges": [
        "(line 1284,col 9)-(line 1284,col 28)",
        "(line 1285,col 9)-(line 1285,col 28)",
        "(line 1286,col 9)-(line 1286,col 51)",
        "(line 1287,col 9)-(line 1287,col 61)",
        "(line 1288,col 9)-(line 1288,col 38)",
        "(line 1289,col 9)-(line 1289,col 61)",
        "(line 1290,col 9)-(line 1290,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfSameType()",
      "begin_line": 1293,
      "end_line": 1323,
      "comment": "",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 51)",
        "(line 1296,col 9)-(line 1296,col 27)",
        "(line 1297,col 9)-(line 1297,col 55)",
        "(line 1298,col 9)-(line 1298,col 55)",
        "(line 1299,col 9)-(line 1299,col 54)",
        "(line 1300,col 9)-(line 1300,col 54)",
        "(line 1301,col 9)-(line 1301,col 50)",
        "(line 1302,col 9)-(line 1308,col 9)",
        "(line 1309,col 9)-(line 1309,col 55)",
        "(line 1310,col 9)-(line 1310,col 44)",
        "(line 1311,col 9)-(line 1322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfPreconditionMixedType()",
      "begin_line": 1325,
      "end_line": 1334,
      "comment": "",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 28)",
        "(line 1328,col 9)-(line 1328,col 28)",
        "(line 1329,col 9)-(line 1329,col 51)",
        "(line 1330,col 9)-(line 1330,col 61)",
        "(line 1331,col 9)-(line 1331,col 38)",
        "(line 1332,col 9)-(line 1332,col 56)",
        "(line 1333,col 9)-(line 1333,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfMixedTypes()",
      "begin_line": 1336,
      "end_line": 1366,
      "comment": "",
      "child_ranges": [
        "(line 1338,col 9)-(line 1338,col 51)",
        "(line 1339,col 9)-(line 1339,col 27)",
        "(line 1340,col 9)-(line 1340,col 55)",
        "(line 1341,col 9)-(line 1341,col 55)",
        "(line 1342,col 9)-(line 1342,col 54)",
        "(line 1343,col 9)-(line 1343,col 60)",
        "(line 1344,col 9)-(line 1344,col 50)",
        "(line 1345,col 9)-(line 1351,col 9)",
        "(line 1352,col 9)-(line 1352,col 55)",
        "(line 1353,col 9)-(line 1353,col 44)",
        "(line 1354,col 9)-(line 1365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 1369,
      "end_line": 1377,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 1371,col 9)-(line 1373,col 9)",
        "(line 1374,col 9)-(line 1376,col 9)"
      ]
    }
  ]
}