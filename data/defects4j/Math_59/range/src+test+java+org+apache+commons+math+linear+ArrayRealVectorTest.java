{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/linear/ArrayRealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVectorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 1151,
      "comment": "\n * Test cases for the {@link ArrayRealVector} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec5"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 75,
      "end_line": 75,
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
      "begin_line": 79,
      "end_line": 336,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.RealVectorTestImpl(double[])",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unsupported()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.iterator()",
      "begin_line": 103,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 104,col 13)-(line 125,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-674c20dd-180c-4eaa-a552-6f9edd44be33.hasNext()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 21)-(line 107,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-a51488f5-95db-4bbf-bf1b-f01761344f2f.next()",
      "begin_line": 109,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 110,col 21)-(line 110,col 38)",
        "(line 111,col 21)-(line 120,col 22)",
        "(line 121,col 21)-(line 121,col 34)",
        "(line 122,col 21)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-2be06d21-a2b1-44a5-86cb-87fdf36a62d5.getValue()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 29)-(line 114,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-a8b0386d-0f8a-481c-8bef-c27c1fe77cd9.setValue(double)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 29)-(line 118,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-9f7f8eaf-2cda-474c-955a-afe6b0dcf89d.remove()",
      "begin_line": 124,
      "end_line": 124,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.sparseIterator()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.copy()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(double[])",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(double[])",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAdd(double)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAddToSelf(double)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtract(double)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtractToSelf(double)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 13)-(line 165,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiply(double)",
      "begin_line": 168,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 51)",
        "(line 170,col 13)-(line 172,col 13)",
        "(line 173,col 13)-(line 173,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiplyToSelf(double)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivide(double)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 13)-(line 181,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivideToSelf(double)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 13)-(line 185,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 13)-(line 189,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(double[])",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 13)-(line 193,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(double[])",
      "begin_line": 200,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 13)-(line 201,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getData()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 13)-(line 205,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 209,col 13)-(line 209,col 27)",
        "(line 210,col 13)-(line 212,col 13)",
        "(line 213,col 13)-(line 213,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(double[])",
      "begin_line": 216,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 27)",
        "(line 218,col 13)-(line 220,col 13)",
        "(line 221,col 13)-(line 221,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getNorm()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Norm()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 13)-(line 229,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfNorm()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(double[])",
      "begin_line": 240,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 13)-(line 245,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(double[])",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 13)-(line 253,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(double[])",
      "begin_line": 256,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitVector()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitize()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 13)-(line 269,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(double[])",
      "begin_line": 272,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 273,col 13)-(line 273,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 277,col 13)-(line 277,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(double[])",
      "begin_line": 280,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 13)-(line 281,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getEntry(int)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 285,col 13)-(line 285,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDimension()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 13)-(line 289,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 293,col 13)-(line 293,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 297,col 13)-(line 297,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double[])",
      "begin_line": 300,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 13)-(line 305,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setEntry(int, double)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 309,col 13)-(line 309,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 313,col 13)-(line 313,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, double[])",
      "begin_line": 316,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 317,col 13)-(line 317,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.set(double)",
      "begin_line": 320,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 13)-(line 321,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.toArray()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 325,col 13)-(line 325,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isNaN()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 329,col 13)-(line 329,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isInfinite()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 333,col 13)-(line 333,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testConstructors()",
      "begin_line": 338,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 51)",
        "(line 342,col 9)-(line 342,col 66)",
        "(line 344,col 9)-(line 344,col 52)",
        "(line 345,col 9)-(line 345,col 66)",
        "(line 346,col 9)-(line 346,col 72)",
        "(line 348,col 9)-(line 348,col 58)",
        "(line 349,col 9)-(line 349,col 66)",
        "(line 350,col 9)-(line 350,col 74)",
        "(line 352,col 9)-(line 352,col 55)",
        "(line 353,col 9)-(line 353,col 66)",
        "(line 354,col 9)-(line 354,col 72)",
        "(line 356,col 9)-(line 356,col 65)",
        "(line 357,col 9)-(line 357,col 70)",
        "(line 358,col 9)-(line 358,col 76)",
        "(line 359,col 9)-(line 359,col 56)",
        "(line 360,col 9)-(line 360,col 53)",
        "(line 362,col 9)-(line 362,col 66)",
        "(line 363,col 9)-(line 363,col 70)",
        "(line 364,col 9)-(line 364,col 76)",
        "(line 365,col 9)-(line 365,col 53)",
        "(line 366,col 9)-(line 366,col 53)",
        "(line 368,col 9)-(line 368,col 61)",
        "(line 369,col 9)-(line 369,col 66)",
        "(line 370,col 9)-(line 370,col 72)",
        "(line 371,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 53)",
        "(line 379,col 9)-(line 379,col 68)",
        "(line 380,col 9)-(line 380,col 74)",
        "(line 382,col 9)-(line 382,col 56)",
        "(line 383,col 9)-(line 383,col 66)",
        "(line 384,col 9)-(line 384,col 72)",
        "(line 386,col 9)-(line 386,col 62)",
        "(line 387,col 9)-(line 387,col 66)",
        "(line 388,col 9)-(line 388,col 72)",
        "(line 389,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 53)",
        "(line 397,col 9)-(line 397,col 66)",
        "(line 398,col 9)-(line 398,col 72)",
        "(line 400,col 9)-(line 400,col 63)",
        "(line 402,col 9)-(line 402,col 57)",
        "(line 403,col 9)-(line 403,col 68)",
        "(line 404,col 9)-(line 404,col 75)",
        "(line 406,col 9)-(line 406,col 59)",
        "(line 407,col 9)-(line 407,col 66)",
        "(line 408,col 9)-(line 408,col 72)",
        "(line 409,col 9)-(line 409,col 76)",
        "(line 411,col 9)-(line 411,col 62)",
        "(line 412,col 9)-(line 412,col 68)",
        "(line 413,col 9)-(line 413,col 74)",
        "(line 414,col 9)-(line 414,col 73)",
        "(line 416,col 9)-(line 416,col 57)",
        "(line 417,col 9)-(line 417,col 67)",
        "(line 418,col 9)-(line 418,col 72)",
        "(line 420,col 9)-(line 420,col 84)",
        "(line 421,col 9)-(line 421,col 67)",
        "(line 422,col 9)-(line 422,col 75)",
        "(line 423,col 9)-(line 423,col 73)",
        "(line 425,col 9)-(line 425,col 84)",
        "(line 426,col 9)-(line 426,col 67)",
        "(line 427,col 9)-(line 427,col 73)",
        "(line 428,col 9)-(line 428,col 75)",
        "(line 430,col 9)-(line 430,col 60)",
        "(line 431,col 9)-(line 431,col 67)",
        "(line 432,col 9)-(line 432,col 75)",
        "(line 433,col 9)-(line 433,col 73)",
        "(line 435,col 9)-(line 435,col 60)",
        "(line 436,col 9)-(line 436,col 67)",
        "(line 437,col 9)-(line 437,col 73)",
        "(line 438,col 9)-(line 438,col 75)",
        "(line 440,col 9)-(line 440,col 62)",
        "(line 441,col 9)-(line 441,col 68)",
        "(line 442,col 9)-(line 442,col 73)",
        "(line 443,col 9)-(line 443,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testDataInOut()",
      "begin_line": 447,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 55)",
        "(line 451,col 9)-(line 451,col 55)",
        "(line 452,col 9)-(line 452,col 55)",
        "(line 453,col 9)-(line 453,col 63)",
        "(line 455,col 9)-(line 455,col 46)",
        "(line 456,col 9)-(line 456,col 74)",
        "(line 457,col 9)-(line 457,col 80)",
        "(line 459,col 9)-(line 459,col 47)",
        "(line 460,col 9)-(line 460,col 74)",
        "(line 461,col 9)-(line 461,col 80)",
        "(line 463,col 9)-(line 463,col 48)",
        "(line 464,col 9)-(line 464,col 74)",
        "(line 465,col 9)-(line 465,col 77)",
        "(line 467,col 9)-(line 467,col 48)",
        "(line 468,col 9)-(line 468,col 74)",
        "(line 469,col 9)-(line 469,col 80)",
        "(line 471,col 9)-(line 471,col 59)",
        "(line 472,col 9)-(line 472,col 74)",
        "(line 473,col 9)-(line 473,col 80)",
        "(line 475,col 9)-(line 475,col 38)",
        "(line 476,col 9)-(line 476,col 70)",
        "(line 477,col 9)-(line 477,col 85)",
        "(line 479,col 9)-(line 479,col 41)",
        "(line 480,col 9)-(line 480,col 64)",
        "(line 481,col 9)-(line 481,col 77)",
        "(line 489,col 9)-(line 489,col 49)",
        "(line 490,col 9)-(line 490,col 69)",
        "(line 491,col 9)-(line 491,col 75)",
        "(line 492,col 9)-(line 497,col 9)",
        "(line 499,col 9)-(line 499,col 43)",
        "(line 500,col 9)-(line 500,col 33)",
        "(line 501,col 9)-(line 501,col 78)",
        "(line 502,col 9)-(line 507,col 9)",
        "(line 509,col 9)-(line 509,col 43)",
        "(line 510,col 9)-(line 510,col 26)",
        "(line 511,col 9)-(line 511,col 76)",
        "(line 512,col 9)-(line 512,col 76)",
        "(line 513,col 9)-(line 518,col 9)",
        "(line 520,col 9)-(line 520,col 43)",
        "(line 521,col 9)-(line 521,col 25)",
        "(line 522,col 9)-(line 522,col 78)",
        "(line 524,col 9)-(line 529,col 9)",
        "(line 531,col 9)-(line 531,col 43)",
        "(line 532,col 9)-(line 532,col 37)",
        "(line 533,col 9)-(line 533,col 76)",
        "(line 534,col 9)-(line 534,col 76)",
        "(line 535,col 9)-(line 540,col 9)",
        "(line 543,col 9)-(line 543,col 43)",
        "(line 544,col 9)-(line 544,col 45)",
        "(line 545,col 9)-(line 545,col 46)",
        "(line 546,col 9)-(line 546,col 34)",
        "(line 547,col 9)-(line 547,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMapFunctions()",
      "begin_line": 551,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 55)",
        "(line 556,col 9)-(line 556,col 46)",
        "(line 557,col 9)-(line 557,col 46)",
        "(line 558,col 9)-(line 558,col 87)",
        "(line 561,col 9)-(line 561,col 46)",
        "(line 562,col 9)-(line 562,col 42)",
        "(line 563,col 9)-(line 563,col 52)",
        "(line 564,col 9)-(line 564,col 99)",
        "(line 567,col 9)-(line 567,col 56)",
        "(line 568,col 9)-(line 568,col 52)",
        "(line 569,col 9)-(line 569,col 97)",
        "(line 572,col 9)-(line 572,col 51)",
        "(line 573,col 9)-(line 573,col 52)",
        "(line 574,col 9)-(line 574,col 58)",
        "(line 575,col 9)-(line 575,col 109)",
        "(line 578,col 9)-(line 578,col 56)",
        "(line 579,col 9)-(line 579,col 51)",
        "(line 580,col 9)-(line 580,col 97)",
        "(line 583,col 9)-(line 583,col 51)",
        "(line 584,col 9)-(line 584,col 52)",
        "(line 585,col 9)-(line 585,col 57)",
        "(line 586,col 9)-(line 586,col 109)",
        "(line 589,col 9)-(line 589,col 52)",
        "(line 590,col 9)-(line 590,col 52)",
        "(line 591,col 9)-(line 591,col 93)",
        "(line 594,col 9)-(line 594,col 49)",
        "(line 595,col 9)-(line 595,col 48)",
        "(line 596,col 9)-(line 596,col 58)",
        "(line 597,col 9)-(line 597,col 105)",
        "(line 600,col 9)-(line 600,col 51)",
        "(line 601,col 9)-(line 601,col 46)",
        "(line 602,col 9)-(line 602,col 87)",
        "(line 605,col 9)-(line 605,col 46)",
        "(line 606,col 9)-(line 606,col 47)",
        "(line 607,col 9)-(line 607,col 52)",
        "(line 608,col 9)-(line 608,col 99)",
        "(line 611,col 9)-(line 611,col 48)",
        "(line 612,col 9)-(line 612,col 105)",
        "(line 613,col 9)-(line 613,col 87)",
        "(line 616,col 9)-(line 616,col 46)",
        "(line 617,col 9)-(line 617,col 44)",
        "(line 618,col 9)-(line 618,col 111)",
        "(line 619,col 9)-(line 619,col 99)",
        "(line 623,col 9)-(line 623,col 52)",
        "(line 624,col 9)-(line 624,col 95)",
        "(line 625,col 9)-(line 625,col 91)",
        "(line 628,col 9)-(line 628,col 48)",
        "(line 629,col 9)-(line 629,col 48)",
        "(line 630,col 9)-(line 630,col 101)",
        "(line 631,col 9)-(line 631,col 103)",
        "(line 634,col 9)-(line 634,col 48)",
        "(line 635,col 9)-(line 635,col 85)",
        "(line 636,col 9)-(line 636,col 87)",
        "(line 639,col 9)-(line 639,col 46)",
        "(line 640,col 9)-(line 640,col 44)",
        "(line 641,col 9)-(line 641,col 91)",
        "(line 642,col 9)-(line 642,col 99)",
        "(line 645,col 9)-(line 645,col 52)",
        "(line 646,col 9)-(line 646,col 87)",
        "(line 647,col 9)-(line 647,col 91)",
        "(line 650,col 9)-(line 650,col 48)",
        "(line 651,col 9)-(line 651,col 48)",
        "(line 652,col 9)-(line 652,col 93)",
        "(line 653,col 9)-(line 653,col 103)",
        "(line 656,col 9)-(line 656,col 52)",
        "(line 657,col 9)-(line 657,col 97)",
        "(line 658,col 9)-(line 658,col 91)",
        "(line 661,col 9)-(line 661,col 48)",
        "(line 662,col 9)-(line 662,col 48)",
        "(line 663,col 9)-(line 663,col 103)",
        "(line 664,col 9)-(line 664,col 103)",
        "(line 667,col 9)-(line 667,col 50)",
        "(line 668,col 9)-(line 668,col 106)",
        "(line 669,col 9)-(line 669,col 89)",
        "(line 672,col 9)-(line 672,col 47)",
        "(line 673,col 9)-(line 673,col 46)",
        "(line 674,col 9)-(line 674,col 112)",
        "(line 675,col 9)-(line 675,col 101)",
        "(line 678,col 9)-(line 678,col 50)",
        "(line 679,col 9)-(line 679,col 106)",
        "(line 680,col 9)-(line 680,col 89)",
        "(line 683,col 9)-(line 683,col 47)",
        "(line 684,col 9)-(line 684,col 46)",
        "(line 685,col 9)-(line 685,col 112)",
        "(line 686,col 9)-(line 686,col 101)",
        "(line 689,col 9)-(line 689,col 50)",
        "(line 690,col 9)-(line 690,col 105)",
        "(line 691,col 9)-(line 691,col 89)",
        "(line 694,col 9)-(line 694,col 47)",
        "(line 695,col 9)-(line 695,col 46)",
        "(line 696,col 9)-(line 696,col 111)",
        "(line 697,col 9)-(line 697,col 101)",
        "(line 700,col 9)-(line 700,col 48)",
        "(line 701,col 9)-(line 701,col 107)",
        "(line 702,col 9)-(line 702,col 87)",
        "(line 705,col 9)-(line 705,col 46)",
        "(line 706,col 9)-(line 706,col 44)",
        "(line 707,col 9)-(line 707,col 113)",
        "(line 708,col 9)-(line 708,col 99)",
        "(line 711,col 9)-(line 711,col 48)",
        "(line 712,col 9)-(line 712,col 104)",
        "(line 713,col 9)-(line 713,col 87)",
        "(line 716,col 9)-(line 716,col 46)",
        "(line 717,col 9)-(line 717,col 44)",
        "(line 718,col 9)-(line 718,col 110)",
        "(line 719,col 9)-(line 719,col 99)",
        "(line 722,col 9)-(line 722,col 48)",
        "(line 723,col 9)-(line 723,col 106)",
        "(line 724,col 9)-(line 724,col 87)",
        "(line 727,col 9)-(line 727,col 46)",
        "(line 728,col 9)-(line 728,col 44)",
        "(line 729,col 9)-(line 729,col 112)",
        "(line 730,col 9)-(line 730,col 99)",
        "(line 732,col 9)-(line 732,col 42)",
        "(line 733,col 9)-(line 733,col 57)",
        "(line 736,col 9)-(line 736,col 51)",
        "(line 737,col 9)-(line 737,col 88)",
        "(line 738,col 9)-(line 738,col 89)",
        "(line 741,col 9)-(line 741,col 48)",
        "(line 742,col 9)-(line 742,col 46)",
        "(line 743,col 9)-(line 743,col 94)",
        "(line 744,col 9)-(line 744,col 101)",
        "(line 747,col 9)-(line 747,col 51)",
        "(line 748,col 9)-(line 748,col 87)",
        "(line 749,col 9)-(line 749,col 89)",
        "(line 752,col 9)-(line 752,col 48)",
        "(line 753,col 9)-(line 753,col 46)",
        "(line 754,col 9)-(line 754,col 93)",
        "(line 755,col 9)-(line 755,col 101)",
        "(line 758,col 9)-(line 758,col 51)",
        "(line 759,col 9)-(line 759,col 87)",
        "(line 760,col 9)-(line 760,col 89)",
        "(line 763,col 9)-(line 763,col 48)",
        "(line 764,col 9)-(line 764,col 46)",
        "(line 765,col 9)-(line 765,col 93)",
        "(line 766,col 9)-(line 766,col 101)",
        "(line 769,col 9)-(line 769,col 52)",
        "(line 770,col 9)-(line 770,col 66)",
        "(line 771,col 9)-(line 771,col 87)",
        "(line 774,col 9)-(line 774,col 46)",
        "(line 775,col 9)-(line 775,col 48)",
        "(line 776,col 9)-(line 776,col 72)",
        "(line 777,col 9)-(line 777,col 99)",
        "(line 779,col 9)-(line 779,col 45)",
        "(line 780,col 9)-(line 780,col 59)",
        "(line 783,col 9)-(line 783,col 51)",
        "(line 784,col 9)-(line 784,col 44)",
        "(line 785,col 9)-(line 785,col 87)",
        "(line 788,col 9)-(line 788,col 49)",
        "(line 789,col 9)-(line 789,col 44)",
        "(line 790,col 9)-(line 790,col 50)",
        "(line 791,col 9)-(line 791,col 99)",
        "(line 794,col 9)-(line 794,col 50)",
        "(line 795,col 9)-(line 795,col 85)",
        "(line 796,col 9)-(line 796,col 89)",
        "(line 799,col 9)-(line 799,col 47)",
        "(line 800,col 9)-(line 800,col 46)",
        "(line 801,col 9)-(line 801,col 91)",
        "(line 802,col 9)-(line 802,col 101)",
        "(line 804,col 9)-(line 804,col 46)",
        "(line 805,col 9)-(line 805,col 61)",
        "(line 808,col 9)-(line 808,col 54)",
        "(line 809,col 9)-(line 809,col 80)",
        "(line 810,col 9)-(line 810,col 89)",
        "(line 813,col 9)-(line 813,col 51)",
        "(line 814,col 9)-(line 814,col 46)",
        "(line 815,col 9)-(line 815,col 87)",
        "(line 816,col 9)-(line 816,col 101)",
        "(line 818,col 9)-(line 818,col 46)",
        "(line 819,col 9)-(line 819,col 61)",
        "(line 822,col 9)-(line 822,col 54)",
        "(line 823,col 9)-(line 823,col 46)",
        "(line 824,col 9)-(line 824,col 89)",
        "(line 827,col 9)-(line 827,col 51)",
        "(line 828,col 9)-(line 828,col 46)",
        "(line 829,col 9)-(line 829,col 53)",
        "(line 830,col 9)-(line 830,col 101)",
        "(line 833,col 9)-(line 833,col 56)",
        "(line 834,col 9)-(line 834,col 47)",
        "(line 835,col 9)-(line 835,col 91)",
        "(line 838,col 9)-(line 838,col 52)",
        "(line 839,col 9)-(line 839,col 48)",
        "(line 840,col 9)-(line 840,col 54)",
        "(line 841,col 9)-(line 841,col 103)",
        "(line 844,col 9)-(line 844,col 54)",
        "(line 845,col 9)-(line 845,col 46)",
        "(line 846,col 9)-(line 846,col 89)",
        "(line 849,col 9)-(line 849,col 51)",
        "(line 850,col 9)-(line 850,col 46)",
        "(line 851,col 9)-(line 851,col 53)",
        "(line 852,col 9)-(line 852,col 101)",
        "(line 855,col 9)-(line 855,col 58)",
        "(line 856,col 9)-(line 856,col 48)",
        "(line 857,col 9)-(line 857,col 93)",
        "(line 860,col 9)-(line 860,col 53)",
        "(line 861,col 9)-(line 861,col 50)",
        "(line 862,col 9)-(line 862,col 55)",
        "(line 863,col 9)-(line 863,col 105)",
        "(line 868,col 9)-(line 868,col 52)",
        "(line 869,col 9)-(line 869,col 105)",
        "(line 870,col 9)-(line 870,col 87)",
        "(line 873,col 9)-(line 873,col 50)",
        "(line 874,col 9)-(line 874,col 44)",
        "(line 875,col 9)-(line 875,col 111)",
        "(line 876,col 9)-(line 876,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testBasicFunctions()",
      "begin_line": 879,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 55)",
        "(line 882,col 9)-(line 882,col 55)",
        "(line 883,col 9)-(line 883,col 55)",
        "(line 884,col 9)-(line 884,col 63)",
        "(line 886,col 9)-(line 886,col 63)",
        "(line 889,col 9)-(line 889,col 40)",
        "(line 890,col 9)-(line 890,col 97)",
        "(line 893,col 9)-(line 893,col 44)",
        "(line 894,col 9)-(line 894,col 82)",
        "(line 897,col 9)-(line 897,col 48)",
        "(line 898,col 9)-(line 898,col 83)",
        "(line 902,col 9)-(line 902,col 41)",
        "(line 903,col 9)-(line 903,col 95)",
        "(line 906,col 9)-(line 906,col 45)",
        "(line 907,col 9)-(line 907,col 97)",
        "(line 910,col 9)-(line 910,col 56)",
        "(line 911,col 9)-(line 911,col 97)",
        "(line 914,col 9)-(line 914,col 55)",
        "(line 915,col 9)-(line 915,col 84)",
        "(line 917,col 9)-(line 917,col 58)",
        "(line 918,col 9)-(line 918,col 86)",
        "(line 920,col 9)-(line 920,col 69)",
        "(line 921,col 9)-(line 921,col 86)",
        "(line 924,col 9)-(line 924,col 58)",
        "(line 925,col 9)-(line 925,col 86)",
        "(line 927,col 9)-(line 927,col 63)",
        "(line 928,col 9)-(line 928,col 88)",
        "(line 930,col 9)-(line 930,col 74)",
        "(line 931,col 9)-(line 931,col 88)",
        "(line 934,col 9)-(line 934,col 43)",
        "(line 935,col 9)-(line 935,col 43)",
        "(line 936,col 9)-(line 936,col 80)",
        "(line 938,col 9)-(line 938,col 62)",
        "(line 939,col 9)-(line 939,col 41)",
        "(line 940,col 9)-(line 940,col 45)",
        "(line 941,col 9)-(line 941,col 82)",
        "(line 944,col 9)-(line 944,col 53)",
        "(line 945,col 9)-(line 945,col 51)",
        "(line 946,col 9)-(line 946,col 88)",
        "(line 948,col 9)-(line 948,col 51)",
        "(line 949,col 9)-(line 949,col 53)",
        "(line 950,col 9)-(line 950,col 92)",
        "(line 953,col 9)-(line 953,col 60)",
        "(line 954,col 9)-(line 954,col 53)",
        "(line 955,col 9)-(line 955,col 94)",
        "(line 957,col 9)-(line 957,col 59)",
        "(line 958,col 9)-(line 958,col 55)",
        "(line 959,col 9)-(line 959,col 98)",
        "(line 961,col 9)-(line 961,col 70)",
        "(line 962,col 9)-(line 962,col 55)",
        "(line 963,col 9)-(line 963,col 98)",
        "(line 966,col 9)-(line 966,col 56)",
        "(line 967,col 9)-(line 967,col 56)",
        "(line 968,col 9)-(line 968,col 90)",
        "(line 970,col 9)-(line 970,col 55)",
        "(line 971,col 9)-(line 971,col 58)",
        "(line 972,col 9)-(line 972,col 94)",
        "(line 974,col 9)-(line 974,col 66)",
        "(line 975,col 9)-(line 975,col 58)",
        "(line 976,col 9)-(line 976,col 94)",
        "(line 979,col 9)-(line 979,col 40)",
        "(line 980,col 9)-(line 980,col 68)",
        "(line 983,col 9)-(line 983,col 44)",
        "(line 984,col 9)-(line 984,col 70)",
        "(line 986,col 9)-(line 986,col 56)",
        "(line 987,col 9)-(line 987,col 92)",
        "(line 989,col 9)-(line 989,col 60)",
        "(line 990,col 9)-(line 990,col 94)",
        "(line 992,col 9)-(line 992,col 71)",
        "(line 993,col 9)-(line 993,col 94)",
        "(line 995,col 9)-(line 995,col 50)",
        "(line 996,col 9)-(line 996,col 63)",
        "(line 997,col 9)-(line 997,col 99)",
        "(line 999,col 9)-(line 1004,col 9)",
        "(line 1006,col 9)-(line 1006,col 46)",
        "(line 1007,col 9)-(line 1007,col 28)",
        "(line 1008,col 9)-(line 1008,col 96)",
        "(line 1009,col 9)-(line 1014,col 9)",
        "(line 1016,col 9)-(line 1016,col 57)",
        "(line 1017,col 9)-(line 1017,col 96)",
        "(line 1018,col 9)-(line 1018,col 94)",
        "(line 1020,col 9)-(line 1020,col 56)",
        "(line 1021,col 9)-(line 1021,col 98)",
        "(line 1022,col 9)-(line 1022,col 98)",
        "(line 1024,col 9)-(line 1024,col 64)",
        "(line 1025,col 9)-(line 1025,col 98)",
        "(line 1026,col 9)-(line 1026,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMisc()",
      "begin_line": 1030,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 55)",
        "(line 1033,col 9)-(line 1033,col 55)",
        "(line 1034,col 9)-(line 1034,col 52)",
        "(line 1036,col 9)-(line 1036,col 36)",
        "(line 1037,col 9)-(line 1037,col 61)",
        "(line 1043,col 9)-(line 1048,col 9)",
        "(line 1050,col 8)-(line 1055,col 9)",
        "(line 1057,col 9)-(line 1062,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testPredicates()",
      "begin_line": 1066,
      "end_line": 1101,
      "comment": "",
      "child_ranges": [
        "(line 1069,col 9)-(line 1069,col 74)",
        "(line 1071,col 9)-(line 1071,col 38)",
        "(line 1072,col 9)-(line 1072,col 34)",
        "(line 1073,col 9)-(line 1073,col 37)",
        "(line 1075,col 9)-(line 1075,col 43)",
        "(line 1076,col 9)-(line 1076,col 48)",
        "(line 1077,col 9)-(line 1077,col 43)",
        "(line 1078,col 9)-(line 1078,col 25)",
        "(line 1079,col 9)-(line 1079,col 42)",
        "(line 1080,col 9)-(line 1080,col 25)",
        "(line 1081,col 9)-(line 1081,col 43)",
        "(line 1083,col 9)-(line 1083,col 25)",
        "(line 1084,col 9)-(line 1084,col 78)",
        "(line 1085,col 9)-(line 1085,col 96)",
        "(line 1086,col 9)-(line 1086,col 82)",
        "(line 1088,col 9)-(line 1089,col 88)",
        "(line 1091,col 9)-(line 1092,col 77)",
        "(line 1094,col 9)-(line 1094,col 39)",
        "(line 1095,col 9)-(line 1095,col 46)",
        "(line 1096,col 9)-(line 1096,col 43)",
        "(line 1097,col 9)-(line 1097,col 53)",
        "(line 1098,col 9)-(line 1098,col 78)",
        "(line 1099,col 9)-(line 1099,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testSerial()",
      "begin_line": 1103,
      "end_line": 1107,
      "comment": "",
      "child_ranges": [
        "(line 1105,col 9)-(line 1105,col 74)",
        "(line 1106,col 9)-(line 1106,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testZeroVectors()",
      "begin_line": 1109,
      "end_line": 1114,
      "comment": "",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 82)",
        "(line 1112,col 9)-(line 1112,col 88)",
        "(line 1113,col 9)-(line 1113,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMinMax()",
      "begin_line": 1116,
      "end_line": 1138,
      "comment": "",
      "child_ranges": [
        "(line 1118,col 9)-(line 1118,col 83)",
        "(line 1119,col 9)-(line 1119,col 50)",
        "(line 1120,col 9)-(line 1120,col 59)",
        "(line 1121,col 9)-(line 1121,col 50)",
        "(line 1122,col 9)-(line 1122,col 59)",
        "(line 1123,col 9)-(line 1123,col 97)",
        "(line 1124,col 9)-(line 1124,col 50)",
        "(line 1125,col 9)-(line 1125,col 59)",
        "(line 1126,col 9)-(line 1126,col 50)",
        "(line 1127,col 9)-(line 1127,col 58)",
        "(line 1128,col 9)-(line 1128,col 90)",
        "(line 1129,col 9)-(line 1129,col 51)",
        "(line 1130,col 9)-(line 1130,col 58)",
        "(line 1131,col 9)-(line 1131,col 51)",
        "(line 1132,col 9)-(line 1132,col 58)",
        "(line 1133,col 9)-(line 1133,col 64)",
        "(line 1134,col 9)-(line 1134,col 51)",
        "(line 1135,col 9)-(line 1135,col 58)",
        "(line 1136,col 9)-(line 1136,col 51)",
        "(line 1137,col 9)-(line 1137,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.assertClose(java.lang.String, double[], double[], double)",
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