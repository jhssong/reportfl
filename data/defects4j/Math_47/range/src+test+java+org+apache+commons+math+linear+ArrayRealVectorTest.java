{
  "filepath": "/tmp/Math-47b/src/test/java/org/apache/commons/math/linear/ArrayRealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVectorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 1382,
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
      "end_line": 362,
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
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-0bdaae1d-a709-44d7-bf33-6028c51996d9.hasNext()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 21)-(line 110,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-daec33d4-4b83-473f-b700-99fe4c85d8e5.next()",
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
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-7e22c4f6-3546-48f7-9e1c-827ef552e85c.getValue()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 29)-(line 117,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-b5a8ba07-1bdd-4751-95b2-4c4704a9fc9a.setValue(double)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 29)-(line 121,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-1b37257c-33de-4ce7-83bb-b6e76bfb6b93.remove()",
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
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getData()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 211,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 27)",
        "(line 213,col 13)-(line 215,col 13)",
        "(line 216,col 13)-(line 216,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(double[])",
      "begin_line": 219,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 27)",
        "(line 221,col 13)-(line 223,col 13)",
        "(line 224,col 13)-(line 224,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.cosine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.cosine(double[])",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getNorm()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Norm()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfNorm()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(double[])",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(double[])",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(double[])",
      "begin_line": 267,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitVector()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitize()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(double[])",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 13)-(line 288,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(double[])",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getEntry(int)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDimension()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 13)-(line 300,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 303,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 304,col 13)-(line 304,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 13)-(line 308,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double[])",
      "begin_line": 311,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 13)-(line 312,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setEntry(int, double)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, double[])",
      "begin_line": 327,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 328,col 13)-(line 328,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.set(double)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 332,col 13)-(line 332,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.toArray()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 336,col 13)-(line 336,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isNaN()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 13)-(line 340,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isInfinite()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 344,col 13)-(line 344,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combine(double, double, double[])",
      "begin_line": 347,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 351,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combineToSelf(double, double, double[])",
      "begin_line": 355,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 13)-(line 360,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testConstructors()",
      "begin_line": 364,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 51)",
        "(line 368,col 9)-(line 368,col 66)",
        "(line 370,col 9)-(line 370,col 52)",
        "(line 371,col 9)-(line 371,col 66)",
        "(line 372,col 9)-(line 372,col 72)",
        "(line 374,col 9)-(line 374,col 58)",
        "(line 375,col 9)-(line 375,col 66)",
        "(line 376,col 9)-(line 376,col 74)",
        "(line 378,col 9)-(line 378,col 55)",
        "(line 379,col 9)-(line 379,col 66)",
        "(line 380,col 9)-(line 380,col 72)",
        "(line 382,col 9)-(line 382,col 65)",
        "(line 383,col 9)-(line 383,col 70)",
        "(line 384,col 9)-(line 384,col 76)",
        "(line 385,col 9)-(line 385,col 56)",
        "(line 386,col 9)-(line 386,col 53)",
        "(line 388,col 9)-(line 388,col 66)",
        "(line 389,col 9)-(line 389,col 70)",
        "(line 390,col 9)-(line 390,col 76)",
        "(line 391,col 9)-(line 391,col 53)",
        "(line 392,col 9)-(line 392,col 53)",
        "(line 394,col 9)-(line 394,col 61)",
        "(line 395,col 9)-(line 395,col 66)",
        "(line 396,col 9)-(line 396,col 72)",
        "(line 397,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 53)",
        "(line 405,col 9)-(line 405,col 68)",
        "(line 406,col 9)-(line 406,col 74)",
        "(line 408,col 9)-(line 408,col 56)",
        "(line 409,col 9)-(line 409,col 66)",
        "(line 410,col 9)-(line 410,col 72)",
        "(line 412,col 9)-(line 412,col 62)",
        "(line 413,col 9)-(line 413,col 66)",
        "(line 414,col 9)-(line 414,col 72)",
        "(line 415,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 422,col 53)",
        "(line 423,col 9)-(line 423,col 66)",
        "(line 424,col 9)-(line 424,col 72)",
        "(line 426,col 9)-(line 426,col 63)",
        "(line 428,col 9)-(line 428,col 57)",
        "(line 429,col 9)-(line 429,col 68)",
        "(line 430,col 9)-(line 430,col 75)",
        "(line 432,col 9)-(line 432,col 59)",
        "(line 433,col 9)-(line 433,col 66)",
        "(line 434,col 9)-(line 434,col 72)",
        "(line 435,col 9)-(line 435,col 76)",
        "(line 437,col 9)-(line 437,col 62)",
        "(line 438,col 9)-(line 438,col 68)",
        "(line 439,col 9)-(line 439,col 74)",
        "(line 440,col 9)-(line 440,col 73)",
        "(line 442,col 9)-(line 442,col 57)",
        "(line 443,col 9)-(line 443,col 67)",
        "(line 444,col 9)-(line 444,col 72)",
        "(line 446,col 9)-(line 446,col 84)",
        "(line 447,col 9)-(line 447,col 67)",
        "(line 448,col 9)-(line 448,col 75)",
        "(line 449,col 9)-(line 449,col 73)",
        "(line 451,col 9)-(line 451,col 84)",
        "(line 452,col 9)-(line 452,col 67)",
        "(line 453,col 9)-(line 453,col 73)",
        "(line 454,col 9)-(line 454,col 75)",
        "(line 456,col 9)-(line 456,col 60)",
        "(line 457,col 9)-(line 457,col 67)",
        "(line 458,col 9)-(line 458,col 75)",
        "(line 459,col 9)-(line 459,col 73)",
        "(line 461,col 9)-(line 461,col 60)",
        "(line 462,col 9)-(line 462,col 67)",
        "(line 463,col 9)-(line 463,col 73)",
        "(line 464,col 9)-(line 464,col 75)",
        "(line 466,col 9)-(line 466,col 62)",
        "(line 467,col 9)-(line 467,col 68)",
        "(line 468,col 9)-(line 468,col 73)",
        "(line 469,col 9)-(line 469,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testDataInOut()",
      "begin_line": 473,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 55)",
        "(line 477,col 9)-(line 477,col 55)",
        "(line 478,col 9)-(line 478,col 55)",
        "(line 479,col 9)-(line 479,col 63)",
        "(line 481,col 9)-(line 481,col 46)",
        "(line 482,col 9)-(line 482,col 74)",
        "(line 483,col 9)-(line 483,col 80)",
        "(line 485,col 9)-(line 485,col 47)",
        "(line 486,col 9)-(line 486,col 74)",
        "(line 487,col 9)-(line 487,col 80)",
        "(line 489,col 9)-(line 489,col 48)",
        "(line 490,col 9)-(line 490,col 74)",
        "(line 491,col 9)-(line 491,col 80)",
        "(line 493,col 9)-(line 493,col 59)",
        "(line 494,col 9)-(line 494,col 74)",
        "(line 495,col 9)-(line 495,col 80)",
        "(line 497,col 9)-(line 497,col 38)",
        "(line 498,col 9)-(line 498,col 70)",
        "(line 499,col 9)-(line 499,col 85)",
        "(line 501,col 9)-(line 501,col 41)",
        "(line 502,col 9)-(line 502,col 64)",
        "(line 503,col 9)-(line 503,col 77)",
        "(line 511,col 9)-(line 511,col 49)",
        "(line 512,col 9)-(line 512,col 69)",
        "(line 513,col 9)-(line 513,col 75)",
        "(line 514,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 43)",
        "(line 522,col 9)-(line 522,col 33)",
        "(line 523,col 9)-(line 523,col 78)",
        "(line 524,col 9)-(line 529,col 9)",
        "(line 531,col 9)-(line 531,col 43)",
        "(line 532,col 9)-(line 532,col 25)",
        "(line 533,col 9)-(line 533,col 78)",
        "(line 535,col 9)-(line 540,col 9)",
        "(line 542,col 9)-(line 542,col 43)",
        "(line 543,col 9)-(line 543,col 37)",
        "(line 544,col 9)-(line 544,col 76)",
        "(line 545,col 9)-(line 545,col 76)",
        "(line 546,col 9)-(line 551,col 9)",
        "(line 554,col 9)-(line 554,col 43)",
        "(line 555,col 9)-(line 555,col 45)",
        "(line 556,col 9)-(line 556,col 46)",
        "(line 557,col 9)-(line 557,col 34)",
        "(line 558,col 9)-(line 558,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMapFunctions()",
      "begin_line": 562,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 55)",
        "(line 567,col 9)-(line 567,col 46)",
        "(line 568,col 9)-(line 568,col 46)",
        "(line 569,col 9)-(line 569,col 87)",
        "(line 572,col 9)-(line 572,col 46)",
        "(line 573,col 9)-(line 573,col 42)",
        "(line 574,col 9)-(line 574,col 52)",
        "(line 575,col 9)-(line 575,col 99)",
        "(line 578,col 9)-(line 578,col 56)",
        "(line 579,col 9)-(line 579,col 52)",
        "(line 580,col 9)-(line 580,col 97)",
        "(line 583,col 9)-(line 583,col 51)",
        "(line 584,col 9)-(line 584,col 52)",
        "(line 585,col 9)-(line 585,col 58)",
        "(line 586,col 9)-(line 586,col 109)",
        "(line 589,col 9)-(line 589,col 56)",
        "(line 590,col 9)-(line 590,col 51)",
        "(line 591,col 9)-(line 591,col 97)",
        "(line 594,col 9)-(line 594,col 51)",
        "(line 595,col 9)-(line 595,col 52)",
        "(line 596,col 9)-(line 596,col 57)",
        "(line 597,col 9)-(line 597,col 109)",
        "(line 600,col 9)-(line 600,col 52)",
        "(line 601,col 9)-(line 601,col 52)",
        "(line 602,col 9)-(line 602,col 93)",
        "(line 605,col 9)-(line 605,col 49)",
        "(line 606,col 9)-(line 606,col 48)",
        "(line 607,col 9)-(line 607,col 58)",
        "(line 608,col 9)-(line 608,col 105)",
        "(line 611,col 9)-(line 611,col 51)",
        "(line 612,col 9)-(line 612,col 46)",
        "(line 613,col 9)-(line 613,col 87)",
        "(line 616,col 9)-(line 616,col 46)",
        "(line 617,col 9)-(line 617,col 47)",
        "(line 618,col 9)-(line 618,col 52)",
        "(line 619,col 9)-(line 619,col 99)",
        "(line 622,col 9)-(line 622,col 48)",
        "(line 623,col 9)-(line 623,col 105)",
        "(line 624,col 9)-(line 624,col 87)",
        "(line 627,col 9)-(line 627,col 46)",
        "(line 628,col 9)-(line 628,col 44)",
        "(line 629,col 9)-(line 629,col 111)",
        "(line 630,col 9)-(line 630,col 99)",
        "(line 634,col 9)-(line 634,col 52)",
        "(line 635,col 9)-(line 635,col 95)",
        "(line 636,col 9)-(line 636,col 91)",
        "(line 639,col 9)-(line 639,col 48)",
        "(line 640,col 9)-(line 640,col 48)",
        "(line 641,col 9)-(line 641,col 101)",
        "(line 642,col 9)-(line 642,col 103)",
        "(line 645,col 9)-(line 645,col 48)",
        "(line 646,col 9)-(line 646,col 85)",
        "(line 647,col 9)-(line 647,col 87)",
        "(line 650,col 9)-(line 650,col 46)",
        "(line 651,col 9)-(line 651,col 44)",
        "(line 652,col 9)-(line 652,col 91)",
        "(line 653,col 9)-(line 653,col 99)",
        "(line 656,col 9)-(line 656,col 52)",
        "(line 657,col 9)-(line 657,col 87)",
        "(line 658,col 9)-(line 658,col 91)",
        "(line 661,col 9)-(line 661,col 48)",
        "(line 662,col 9)-(line 662,col 48)",
        "(line 663,col 9)-(line 663,col 93)",
        "(line 664,col 9)-(line 664,col 103)",
        "(line 667,col 9)-(line 667,col 52)",
        "(line 668,col 9)-(line 668,col 97)",
        "(line 669,col 9)-(line 669,col 91)",
        "(line 672,col 9)-(line 672,col 48)",
        "(line 673,col 9)-(line 673,col 48)",
        "(line 674,col 9)-(line 674,col 103)",
        "(line 675,col 9)-(line 675,col 103)",
        "(line 678,col 9)-(line 678,col 50)",
        "(line 679,col 9)-(line 679,col 106)",
        "(line 680,col 9)-(line 680,col 89)",
        "(line 683,col 9)-(line 683,col 47)",
        "(line 684,col 9)-(line 684,col 46)",
        "(line 685,col 9)-(line 685,col 112)",
        "(line 686,col 9)-(line 686,col 101)",
        "(line 689,col 9)-(line 689,col 50)",
        "(line 690,col 9)-(line 690,col 106)",
        "(line 691,col 9)-(line 691,col 89)",
        "(line 694,col 9)-(line 694,col 47)",
        "(line 695,col 9)-(line 695,col 46)",
        "(line 696,col 9)-(line 696,col 112)",
        "(line 697,col 9)-(line 697,col 101)",
        "(line 700,col 9)-(line 700,col 50)",
        "(line 701,col 9)-(line 701,col 105)",
        "(line 702,col 9)-(line 702,col 89)",
        "(line 705,col 9)-(line 705,col 47)",
        "(line 706,col 9)-(line 706,col 46)",
        "(line 707,col 9)-(line 707,col 111)",
        "(line 708,col 9)-(line 708,col 101)",
        "(line 711,col 9)-(line 711,col 48)",
        "(line 712,col 9)-(line 712,col 107)",
        "(line 713,col 9)-(line 713,col 87)",
        "(line 716,col 9)-(line 716,col 46)",
        "(line 717,col 9)-(line 717,col 44)",
        "(line 718,col 9)-(line 718,col 113)",
        "(line 719,col 9)-(line 719,col 99)",
        "(line 722,col 9)-(line 722,col 48)",
        "(line 723,col 9)-(line 723,col 104)",
        "(line 724,col 9)-(line 724,col 87)",
        "(line 727,col 9)-(line 727,col 46)",
        "(line 728,col 9)-(line 728,col 44)",
        "(line 729,col 9)-(line 729,col 110)",
        "(line 730,col 9)-(line 730,col 99)",
        "(line 733,col 9)-(line 733,col 48)",
        "(line 734,col 9)-(line 734,col 106)",
        "(line 735,col 9)-(line 735,col 87)",
        "(line 738,col 9)-(line 738,col 46)",
        "(line 739,col 9)-(line 739,col 44)",
        "(line 740,col 9)-(line 740,col 112)",
        "(line 741,col 9)-(line 741,col 99)",
        "(line 743,col 9)-(line 743,col 42)",
        "(line 744,col 9)-(line 744,col 57)",
        "(line 747,col 9)-(line 747,col 51)",
        "(line 748,col 9)-(line 748,col 88)",
        "(line 749,col 9)-(line 749,col 89)",
        "(line 752,col 9)-(line 752,col 48)",
        "(line 753,col 9)-(line 753,col 46)",
        "(line 754,col 9)-(line 754,col 94)",
        "(line 755,col 9)-(line 755,col 101)",
        "(line 758,col 9)-(line 758,col 51)",
        "(line 759,col 9)-(line 759,col 87)",
        "(line 760,col 9)-(line 760,col 89)",
        "(line 763,col 9)-(line 763,col 48)",
        "(line 764,col 9)-(line 764,col 46)",
        "(line 765,col 9)-(line 765,col 93)",
        "(line 766,col 9)-(line 766,col 101)",
        "(line 769,col 9)-(line 769,col 51)",
        "(line 770,col 9)-(line 770,col 87)",
        "(line 771,col 9)-(line 771,col 89)",
        "(line 774,col 9)-(line 774,col 48)",
        "(line 775,col 9)-(line 775,col 46)",
        "(line 776,col 9)-(line 776,col 93)",
        "(line 777,col 9)-(line 777,col 101)",
        "(line 780,col 9)-(line 780,col 52)",
        "(line 781,col 9)-(line 781,col 66)",
        "(line 782,col 9)-(line 782,col 87)",
        "(line 785,col 9)-(line 785,col 46)",
        "(line 786,col 9)-(line 786,col 48)",
        "(line 787,col 9)-(line 787,col 72)",
        "(line 788,col 9)-(line 788,col 99)",
        "(line 790,col 9)-(line 790,col 45)",
        "(line 791,col 9)-(line 791,col 59)",
        "(line 794,col 9)-(line 794,col 51)",
        "(line 795,col 9)-(line 795,col 44)",
        "(line 796,col 9)-(line 796,col 87)",
        "(line 799,col 9)-(line 799,col 49)",
        "(line 800,col 9)-(line 800,col 44)",
        "(line 801,col 9)-(line 801,col 50)",
        "(line 802,col 9)-(line 802,col 99)",
        "(line 805,col 9)-(line 805,col 50)",
        "(line 806,col 9)-(line 806,col 85)",
        "(line 807,col 9)-(line 807,col 89)",
        "(line 810,col 9)-(line 810,col 47)",
        "(line 811,col 9)-(line 811,col 46)",
        "(line 812,col 9)-(line 812,col 91)",
        "(line 813,col 9)-(line 813,col 101)",
        "(line 815,col 9)-(line 815,col 46)",
        "(line 816,col 9)-(line 816,col 61)",
        "(line 819,col 9)-(line 819,col 54)",
        "(line 820,col 9)-(line 820,col 80)",
        "(line 821,col 9)-(line 821,col 89)",
        "(line 824,col 9)-(line 824,col 51)",
        "(line 825,col 9)-(line 825,col 46)",
        "(line 826,col 9)-(line 826,col 87)",
        "(line 827,col 9)-(line 827,col 101)",
        "(line 829,col 9)-(line 829,col 46)",
        "(line 830,col 9)-(line 830,col 61)",
        "(line 833,col 9)-(line 833,col 54)",
        "(line 834,col 9)-(line 834,col 46)",
        "(line 835,col 9)-(line 835,col 89)",
        "(line 838,col 9)-(line 838,col 51)",
        "(line 839,col 9)-(line 839,col 46)",
        "(line 840,col 9)-(line 840,col 53)",
        "(line 841,col 9)-(line 841,col 101)",
        "(line 844,col 9)-(line 844,col 56)",
        "(line 845,col 9)-(line 845,col 47)",
        "(line 846,col 9)-(line 846,col 91)",
        "(line 849,col 9)-(line 849,col 52)",
        "(line 850,col 9)-(line 850,col 48)",
        "(line 851,col 9)-(line 851,col 54)",
        "(line 852,col 9)-(line 852,col 103)",
        "(line 855,col 9)-(line 855,col 54)",
        "(line 856,col 9)-(line 856,col 46)",
        "(line 857,col 9)-(line 857,col 89)",
        "(line 860,col 9)-(line 860,col 51)",
        "(line 861,col 9)-(line 861,col 46)",
        "(line 862,col 9)-(line 862,col 53)",
        "(line 863,col 9)-(line 863,col 101)",
        "(line 866,col 9)-(line 866,col 58)",
        "(line 867,col 9)-(line 867,col 48)",
        "(line 868,col 9)-(line 868,col 93)",
        "(line 871,col 9)-(line 871,col 53)",
        "(line 872,col 9)-(line 872,col 50)",
        "(line 873,col 9)-(line 873,col 55)",
        "(line 874,col 9)-(line 874,col 105)",
        "(line 879,col 9)-(line 879,col 52)",
        "(line 880,col 9)-(line 880,col 105)",
        "(line 881,col 9)-(line 881,col 87)",
        "(line 884,col 9)-(line 884,col 50)",
        "(line 885,col 9)-(line 885,col 44)",
        "(line 886,col 9)-(line 886,col 111)",
        "(line 887,col 9)-(line 887,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testBasicFunctions()",
      "begin_line": 890,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 55)",
        "(line 893,col 9)-(line 893,col 55)",
        "(line 894,col 9)-(line 894,col 55)",
        "(line 895,col 9)-(line 895,col 63)",
        "(line 897,col 9)-(line 897,col 63)",
        "(line 900,col 9)-(line 900,col 40)",
        "(line 901,col 9)-(line 901,col 97)",
        "(line 904,col 9)-(line 904,col 44)",
        "(line 905,col 9)-(line 905,col 82)",
        "(line 908,col 9)-(line 908,col 48)",
        "(line 909,col 9)-(line 909,col 83)",
        "(line 913,col 9)-(line 913,col 41)",
        "(line 914,col 9)-(line 914,col 95)",
        "(line 917,col 9)-(line 917,col 45)",
        "(line 918,col 9)-(line 918,col 97)",
        "(line 921,col 9)-(line 921,col 56)",
        "(line 922,col 9)-(line 922,col 97)",
        "(line 925,col 9)-(line 925,col 55)",
        "(line 926,col 9)-(line 926,col 84)",
        "(line 928,col 9)-(line 928,col 58)",
        "(line 929,col 9)-(line 929,col 86)",
        "(line 931,col 9)-(line 931,col 69)",
        "(line 932,col 9)-(line 932,col 86)",
        "(line 935,col 9)-(line 935,col 58)",
        "(line 936,col 9)-(line 936,col 86)",
        "(line 938,col 9)-(line 938,col 63)",
        "(line 939,col 9)-(line 939,col 88)",
        "(line 941,col 9)-(line 941,col 74)",
        "(line 942,col 9)-(line 942,col 88)",
        "(line 945,col 9)-(line 945,col 43)",
        "(line 946,col 9)-(line 946,col 43)",
        "(line 947,col 9)-(line 947,col 80)",
        "(line 949,col 9)-(line 949,col 62)",
        "(line 950,col 9)-(line 950,col 41)",
        "(line 951,col 9)-(line 951,col 45)",
        "(line 952,col 9)-(line 952,col 82)",
        "(line 955,col 9)-(line 955,col 53)",
        "(line 956,col 9)-(line 956,col 51)",
        "(line 957,col 9)-(line 957,col 88)",
        "(line 959,col 9)-(line 959,col 51)",
        "(line 960,col 9)-(line 960,col 53)",
        "(line 961,col 9)-(line 961,col 92)",
        "(line 964,col 9)-(line 964,col 60)",
        "(line 965,col 9)-(line 965,col 53)",
        "(line 966,col 9)-(line 966,col 94)",
        "(line 968,col 9)-(line 968,col 59)",
        "(line 969,col 9)-(line 969,col 55)",
        "(line 970,col 9)-(line 970,col 98)",
        "(line 972,col 9)-(line 972,col 70)",
        "(line 973,col 9)-(line 973,col 55)",
        "(line 974,col 9)-(line 974,col 98)",
        "(line 977,col 9)-(line 977,col 56)",
        "(line 978,col 9)-(line 978,col 56)",
        "(line 979,col 9)-(line 979,col 90)",
        "(line 981,col 9)-(line 981,col 55)",
        "(line 982,col 9)-(line 982,col 58)",
        "(line 983,col 9)-(line 983,col 94)",
        "(line 985,col 9)-(line 985,col 66)",
        "(line 986,col 9)-(line 986,col 58)",
        "(line 987,col 9)-(line 987,col 94)",
        "(line 990,col 9)-(line 990,col 40)",
        "(line 991,col 9)-(line 991,col 68)",
        "(line 994,col 9)-(line 994,col 44)",
        "(line 995,col 9)-(line 995,col 70)",
        "(line 997,col 9)-(line 997,col 56)",
        "(line 998,col 9)-(line 998,col 92)",
        "(line 1000,col 9)-(line 1000,col 60)",
        "(line 1001,col 9)-(line 1001,col 94)",
        "(line 1003,col 9)-(line 1003,col 71)",
        "(line 1004,col 9)-(line 1004,col 94)",
        "(line 1006,col 9)-(line 1006,col 50)",
        "(line 1007,col 9)-(line 1007,col 63)",
        "(line 1008,col 9)-(line 1008,col 99)",
        "(line 1010,col 9)-(line 1015,col 9)",
        "(line 1017,col 9)-(line 1017,col 46)",
        "(line 1018,col 9)-(line 1018,col 28)",
        "(line 1019,col 9)-(line 1019,col 96)",
        "(line 1020,col 9)-(line 1025,col 9)",
        "(line 1027,col 9)-(line 1027,col 52)",
        "(line 1028,col 9)-(line 1028,col 96)",
        "(line 1029,col 9)-(line 1029,col 94)",
        "(line 1031,col 9)-(line 1031,col 56)",
        "(line 1032,col 9)-(line 1032,col 98)",
        "(line 1033,col 9)-(line 1033,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMisc()",
      "begin_line": 1036,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 55)",
        "(line 1039,col 9)-(line 1039,col 55)",
        "(line 1040,col 9)-(line 1040,col 52)",
        "(line 1042,col 9)-(line 1042,col 36)",
        "(line 1043,col 9)-(line 1043,col 61)",
        "(line 1049,col 9)-(line 1054,col 9)",
        "(line 1056,col 8)-(line 1061,col 9)",
        "(line 1063,col 9)-(line 1068,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testPredicates()",
      "begin_line": 1072,
      "end_line": 1107,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 9)-(line 1075,col 74)",
        "(line 1077,col 9)-(line 1077,col 38)",
        "(line 1078,col 9)-(line 1078,col 34)",
        "(line 1079,col 9)-(line 1079,col 37)",
        "(line 1081,col 9)-(line 1081,col 43)",
        "(line 1082,col 9)-(line 1082,col 48)",
        "(line 1083,col 9)-(line 1083,col 43)",
        "(line 1084,col 9)-(line 1084,col 25)",
        "(line 1085,col 9)-(line 1085,col 42)",
        "(line 1086,col 9)-(line 1086,col 25)",
        "(line 1087,col 9)-(line 1087,col 43)",
        "(line 1089,col 9)-(line 1089,col 25)",
        "(line 1090,col 9)-(line 1090,col 78)",
        "(line 1091,col 9)-(line 1091,col 96)",
        "(line 1092,col 9)-(line 1092,col 82)",
        "(line 1094,col 9)-(line 1095,col 88)",
        "(line 1097,col 9)-(line 1098,col 77)",
        "(line 1100,col 9)-(line 1100,col 39)",
        "(line 1101,col 9)-(line 1101,col 46)",
        "(line 1102,col 9)-(line 1102,col 43)",
        "(line 1103,col 9)-(line 1103,col 53)",
        "(line 1104,col 9)-(line 1104,col 78)",
        "(line 1105,col 9)-(line 1105,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testSerial()",
      "begin_line": 1109,
      "end_line": 1113,
      "comment": "",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 74)",
        "(line 1112,col 9)-(line 1112,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testZeroVectors()",
      "begin_line": 1115,
      "end_line": 1120,
      "comment": "",
      "child_ranges": [
        "(line 1117,col 9)-(line 1117,col 82)",
        "(line 1118,col 9)-(line 1118,col 88)",
        "(line 1119,col 9)-(line 1119,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMinMax()",
      "begin_line": 1122,
      "end_line": 1144,
      "comment": "",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 83)",
        "(line 1125,col 9)-(line 1125,col 50)",
        "(line 1126,col 9)-(line 1126,col 59)",
        "(line 1127,col 9)-(line 1127,col 50)",
        "(line 1128,col 9)-(line 1128,col 59)",
        "(line 1129,col 9)-(line 1129,col 97)",
        "(line 1130,col 9)-(line 1130,col 50)",
        "(line 1131,col 9)-(line 1131,col 59)",
        "(line 1132,col 9)-(line 1132,col 50)",
        "(line 1133,col 9)-(line 1133,col 58)",
        "(line 1134,col 9)-(line 1134,col 90)",
        "(line 1135,col 9)-(line 1135,col 51)",
        "(line 1136,col 9)-(line 1136,col 58)",
        "(line 1137,col 9)-(line 1137,col 51)",
        "(line 1138,col 9)-(line 1138,col 58)",
        "(line 1139,col 9)-(line 1139,col 64)",
        "(line 1140,col 9)-(line 1140,col 51)",
        "(line 1141,col 9)-(line 1141,col 58)",
        "(line 1142,col 9)-(line 1142,col 51)",
        "(line 1143,col 9)-(line 1143,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosine()",
      "begin_line": 1146,
      "end_line": 1165,
      "comment": "",
      "child_ranges": [
        "(line 1148,col 9)-(line 1148,col 78)",
        "(line 1150,col 9)-(line 1150,col 48)",
        "(line 1151,col 9)-(line 1151,col 50)",
        "(line 1152,col 9)-(line 1152,col 78)",
        "(line 1154,col 9)-(line 1154,col 39)",
        "(line 1155,col 9)-(line 1155,col 39)",
        "(line 1156,col 9)-(line 1156,col 59)",
        "(line 1158,col 9)-(line 1158,col 39)",
        "(line 1159,col 9)-(line 1159,col 39)",
        "(line 1160,col 9)-(line 1160,col 47)",
        "(line 1162,col 9)-(line 1162,col 40)",
        "(line 1163,col 9)-(line 1163,col 39)",
        "(line 1164,col 9)-(line 1164,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosinePrecondition1()",
      "begin_line": 1167,
      "end_line": 1172,
      "comment": "",
      "child_ranges": [
        "(line 1169,col 9)-(line 1169,col 78)",
        "(line 1170,col 9)-(line 1170,col 78)",
        "(line 1171,col 9)-(line 1171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosinePrecondition2()",
      "begin_line": 1173,
      "end_line": 1178,
      "comment": "",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 78)",
        "(line 1176,col 9)-(line 1176,col 78)",
        "(line 1177,col 9)-(line 1177,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosinePrecondition3()",
      "begin_line": 1179,
      "end_line": 1184,
      "comment": "",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 78)",
        "(line 1182,col 9)-(line 1182,col 81)",
        "(line 1183,col 9)-(line 1183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testOuterProduct()",
      "begin_line": 1186,
      "end_line": 1200,
      "comment": "",
      "child_ranges": [
        "(line 1188,col 9)-(line 1188,col 79)",
        "(line 1189,col 9)-(line 1189,col 76)",
        "(line 1191,col 9)-(line 1191,col 48)",
        "(line 1193,col 9)-(line 1193,col 40)",
        "(line 1194,col 9)-(line 1194,col 55)",
        "(line 1195,col 9)-(line 1195,col 56)",
        "(line 1196,col 9)-(line 1196,col 55)",
        "(line 1197,col 9)-(line 1197,col 56)",
        "(line 1198,col 9)-(line 1198,col 57)",
        "(line 1199,col 9)-(line 1199,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombinePreconditionSameType()",
      "begin_line": 1202,
      "end_line": 1211,
      "comment": "",
      "child_ranges": [
        "(line 1204,col 9)-(line 1204,col 28)",
        "(line 1205,col 9)-(line 1205,col 28)",
        "(line 1206,col 9)-(line 1206,col 51)",
        "(line 1207,col 9)-(line 1207,col 61)",
        "(line 1208,col 9)-(line 1208,col 38)",
        "(line 1209,col 9)-(line 1209,col 61)",
        "(line 1210,col 9)-(line 1210,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineSameType()",
      "begin_line": 1213,
      "end_line": 1242,
      "comment": "",
      "child_ranges": [
        "(line 1215,col 9)-(line 1215,col 51)",
        "(line 1216,col 9)-(line 1216,col 27)",
        "(line 1217,col 9)-(line 1217,col 55)",
        "(line 1218,col 9)-(line 1218,col 55)",
        "(line 1219,col 9)-(line 1219,col 54)",
        "(line 1220,col 9)-(line 1220,col 54)",
        "(line 1221,col 9)-(line 1221,col 50)",
        "(line 1222,col 9)-(line 1228,col 9)",
        "(line 1229,col 9)-(line 1229,col 61)",
        "(line 1230,col 9)-(line 1241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombinePreconditionMixedType()",
      "begin_line": 1244,
      "end_line": 1253,
      "comment": "",
      "child_ranges": [
        "(line 1246,col 9)-(line 1246,col 28)",
        "(line 1247,col 9)-(line 1247,col 28)",
        "(line 1248,col 9)-(line 1248,col 51)",
        "(line 1249,col 9)-(line 1249,col 61)",
        "(line 1250,col 9)-(line 1250,col 38)",
        "(line 1251,col 9)-(line 1251,col 56)",
        "(line 1252,col 9)-(line 1252,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineMixedTypes()",
      "begin_line": 1255,
      "end_line": 1284,
      "comment": "",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 51)",
        "(line 1258,col 9)-(line 1258,col 27)",
        "(line 1259,col 9)-(line 1259,col 55)",
        "(line 1260,col 9)-(line 1260,col 55)",
        "(line 1261,col 9)-(line 1261,col 54)",
        "(line 1262,col 9)-(line 1262,col 60)",
        "(line 1263,col 9)-(line 1263,col 50)",
        "(line 1264,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1271,col 61)",
        "(line 1272,col 9)-(line 1283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfPreconditionSameType()",
      "begin_line": 1286,
      "end_line": 1295,
      "comment": "",
      "child_ranges": [
        "(line 1288,col 9)-(line 1288,col 28)",
        "(line 1289,col 9)-(line 1289,col 28)",
        "(line 1290,col 9)-(line 1290,col 51)",
        "(line 1291,col 9)-(line 1291,col 61)",
        "(line 1292,col 9)-(line 1292,col 38)",
        "(line 1293,col 9)-(line 1293,col 61)",
        "(line 1294,col 9)-(line 1294,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfSameType()",
      "begin_line": 1297,
      "end_line": 1327,
      "comment": "",
      "child_ranges": [
        "(line 1299,col 9)-(line 1299,col 51)",
        "(line 1300,col 9)-(line 1300,col 27)",
        "(line 1301,col 9)-(line 1301,col 55)",
        "(line 1302,col 9)-(line 1302,col 55)",
        "(line 1303,col 9)-(line 1303,col 54)",
        "(line 1304,col 9)-(line 1304,col 54)",
        "(line 1305,col 9)-(line 1305,col 50)",
        "(line 1306,col 9)-(line 1312,col 9)",
        "(line 1313,col 9)-(line 1313,col 55)",
        "(line 1314,col 9)-(line 1314,col 44)",
        "(line 1315,col 9)-(line 1326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfPreconditionMixedType()",
      "begin_line": 1329,
      "end_line": 1338,
      "comment": "",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 28)",
        "(line 1332,col 9)-(line 1332,col 28)",
        "(line 1333,col 9)-(line 1333,col 51)",
        "(line 1334,col 9)-(line 1334,col 61)",
        "(line 1335,col 9)-(line 1335,col 38)",
        "(line 1336,col 9)-(line 1336,col 56)",
        "(line 1337,col 9)-(line 1337,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfMixedTypes()",
      "begin_line": 1340,
      "end_line": 1370,
      "comment": "",
      "child_ranges": [
        "(line 1342,col 9)-(line 1342,col 51)",
        "(line 1343,col 9)-(line 1343,col 27)",
        "(line 1344,col 9)-(line 1344,col 55)",
        "(line 1345,col 9)-(line 1345,col 55)",
        "(line 1346,col 9)-(line 1346,col 54)",
        "(line 1347,col 9)-(line 1347,col 60)",
        "(line 1348,col 9)-(line 1348,col 50)",
        "(line 1349,col 9)-(line 1355,col 9)",
        "(line 1356,col 9)-(line 1356,col 55)",
        "(line 1357,col 9)-(line 1357,col 44)",
        "(line 1358,col 9)-(line 1369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 1373,
      "end_line": 1381,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 1375,col 9)-(line 1377,col 9)",
        "(line 1378,col 9)-(line 1380,col 9)"
      ]
    }
  ]
}