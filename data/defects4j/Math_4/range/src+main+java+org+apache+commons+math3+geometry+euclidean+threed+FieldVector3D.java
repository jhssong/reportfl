{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/FieldVector3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldVector3D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 1186,
      "comment": "\n * This class is a re-implementation of {@link Vector3D} using {@link RealFieldElement}.\n * \u003cp\u003eInstance of this class are guaranteed to be immutable.\u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Abscissa. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Ordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Height. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, T, T)",
      "begin_line": 60,
      "end_line": 64,
      "comment": " Simple constructor.\n     * Build a vector from its coordinates\n     * @param x abscissa\n     * @param y ordinate\n     * @param z height\n     * @see #getX()\n     * @see #getY()\n     * @see #getZ()\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 19)",
        "(line 62,col 9)-(line 62,col 19)",
        "(line 63,col 9)-(line 63,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T[])",
      "begin_line": 72,
      "end_line": 79,
      "comment": " Simple constructor.\n     * Build a vector from its coordinates\n     * @param v coordinates array\n     * @exception DimensionMismatchException if array does not have 3 elements\n     * @see #toArray()\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 22)",
        "(line 77,col 9)-(line 77,col 22)",
        "(line 78,col 9)-(line 78,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, T)",
      "begin_line": 89,
      "end_line": 94,
      "comment": " Simple constructor.\n     * Build a vector from its azimuthal coordinates\n     * @param alpha azimuth (\u0026alpha;) around Z\n     *              (0 is +X, \u0026pi;/2 is +Y, \u0026pi; is -X and 3\u0026pi;/2 is -Y)\n     * @param delta elevation (\u0026delta;) above (XY) plane, from -\u0026pi;/2 to +\u0026pi;/2\n     * @see #getAlpha()\n     * @see #getDelta()\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 33)",
        "(line 91,col 9)-(line 91,col 48)",
        "(line 92,col 9)-(line 92,col 48)",
        "(line 93,col 9)-(line 93,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 102,
      "end_line": 106,
      "comment": " Multiplicative constructor\n     * Build a vector from another one and a scale factor.\n     * The vector built will be a * u\n     * @param a scale factor\n     * @param u base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 33)",
        "(line 105,col 9)-(line 105,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 114,
      "end_line": 118,
      "comment": " Multiplicative constructor\n     * Build a vector from another one and a scale factor.\n     * The vector built will be a * u\n     * @param a scale factor\n     * @param u base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 38)",
        "(line 116,col 9)-(line 116,col 38)",
        "(line 117,col 9)-(line 117,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 126,
      "end_line": 130,
      "comment": " Multiplicative constructor\n     * Build a vector from another one and a scale factor.\n     * The vector built will be a * u\n     * @param a scale factor\n     * @param u base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 33)",
        "(line 129,col 9)-(line 129,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 140,
      "end_line": 146,
      "comment": " Linear constructor\n     * Build a vector from two other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 31)",
        "(line 143,col 9)-(line 143,col 75)",
        "(line 144,col 9)-(line 144,col 75)",
        "(line 145,col 9)-(line 145,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 156,
      "end_line": 162,
      "comment": " Linear constructor\n     * Build a vector from two other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 31)",
        "(line 159,col 9)-(line 159,col 75)",
        "(line 160,col 9)-(line 160,col 75)",
        "(line 161,col 9)-(line 161,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 172,
      "end_line": 178,
      "comment": " Linear constructor\n     * Build a vector from two other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 38)",
        "(line 175,col 9)-(line 175,col 75)",
        "(line 176,col 9)-(line 176,col 75)",
        "(line 177,col 9)-(line 177,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 190,
      "end_line": 197,
      "comment": " Linear constructor\n     * Build a vector from three other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 31)",
        "(line 194,col 9)-(line 194,col 90)",
        "(line 195,col 9)-(line 195,col 90)",
        "(line 196,col 9)-(line 196,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 209,
      "end_line": 216,
      "comment": " Linear constructor\n     * Build a vector from three other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 31)",
        "(line 213,col 9)-(line 213,col 90)",
        "(line 214,col 9)-(line 214,col 90)",
        "(line 215,col 9)-(line 215,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 228,
      "end_line": 235,
      "comment": " Linear constructor\n     * Build a vector from three other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 38)",
        "(line 232,col 9)-(line 232,col 90)",
        "(line 233,col 9)-(line 233,col 90)",
        "(line 234,col 9)-(line 234,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 249,
      "end_line": 257,
      "comment": " Linear constructor\n     * Build a vector from four other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     * @param a4 fourth scale factor\n     * @param u4 fourth base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 31)",
        "(line 254,col 9)-(line 254,col 105)",
        "(line 255,col 9)-(line 255,col 105)",
        "(line 256,col 9)-(line 256,col 105)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 271,
      "end_line": 279,
      "comment": " Linear constructor\n     * Build a vector from four other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     * @param a4 fourth scale factor\n     * @param u4 fourth base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 31)",
        "(line 276,col 9)-(line 276,col 105)",
        "(line 277,col 9)-(line 277,col 105)",
        "(line 278,col 9)-(line 278,col 105)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.FieldVector3D(double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 293,
      "end_line": 301,
      "comment": " Linear constructor\n     * Build a vector from four other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     * @param a4 fourth scale factor\n     * @param u4 fourth base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 38)",
        "(line 298,col 9)-(line 298,col 105)",
        "(line 299,col 9)-(line 299,col 105)",
        "(line 300,col 9)-(line 300,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.getX()",
      "begin_line": 307,
      "end_line": 309,
      "comment": " Get the abscissa of the vector.\n     * @return abscissa of the vector\n     * @see #FieldVector3D(RealFieldElement, RealFieldElement, RealFieldElement)\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.getY()",
      "begin_line": 315,
      "end_line": 317,
      "comment": " Get the ordinate of the vector.\n     * @return ordinate of the vector\n     * @see #FieldVector3D(RealFieldElement, RealFieldElement, RealFieldElement)\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.getZ()",
      "begin_line": 323,
      "end_line": 325,
      "comment": " Get the height of the vector.\n     * @return height of the vector\n     * @see #FieldVector3D(RealFieldElement, RealFieldElement, RealFieldElement)\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.toArray()",
      "begin_line": 331,
      "end_line": 337,
      "comment": " Get the vector coordinates as a dimension 3 array.\n     * @return vector coordinates\n     * @see #FieldVector3D(RealFieldElement[])\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 65)",
        "(line 333,col 9)-(line 333,col 21)",
        "(line 334,col 9)-(line 334,col 21)",
        "(line 335,col 9)-(line 335,col 21)",
        "(line 336,col 9)-(line 336,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.toVector3D()",
      "begin_line": 342,
      "end_line": 344,
      "comment": " Convert to a constant vector without derivatives.\n     * @return a constant vector\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.getNorm1()",
      "begin_line": 349,
      "end_line": 351,
      "comment": " Get the L\u003csub\u003e1\u003c/sub\u003e norm for the vector.\n     * @return L\u003csub\u003e1\u003c/sub\u003e norm for the vector\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.getNorm()",
      "begin_line": 356,
      "end_line": 359,
      "comment": " Get the L\u003csub\u003e2\u003c/sub\u003e norm for the vector.\n     * @return Euclidean norm for the vector\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.getNormSq()",
      "begin_line": 364,
      "end_line": 367,
      "comment": " Get the square of the norm for the vector.\n     * @return square of the Euclidean norm for the vector\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.getNormInf()",
      "begin_line": 372,
      "end_line": 389,
      "comment": " Get the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector.\n     * @return L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 31)",
        "(line 374,col 9)-(line 374,col 31)",
        "(line 375,col 9)-(line 375,col 31)",
        "(line 376,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.getAlpha()",
      "begin_line": 395,
      "end_line": 397,
      "comment": " Get the azimuth of the vector.\n     * @return azimuth (\u0026alpha;) of the vector, between -\u0026pi; and +\u0026pi;\n     * @see #FieldVector3D(RealFieldElement, RealFieldElement)\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.getDelta()",
      "begin_line": 403,
      "end_line": 405,
      "comment": " Get the elevation of the vector.\n     * @return elevation (\u0026delta;) of the vector, between -\u0026pi;/2 and +\u0026pi;/2\n     * @see #FieldVector3D(RealFieldElement, RealFieldElement)\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.add(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 411,
      "end_line": 413,
      "comment": " Add a vector to the instance.\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.add(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 419,
      "end_line": 421,
      "comment": " Add a vector to the instance.\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.add(T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 428,
      "end_line": 430,
      "comment": " Add a scaled vector to the instance.\n     * @param factor scale factor to apply to v before adding it\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.add(T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 437,
      "end_line": 441,
      "comment": " Add a scaled vector to the instance.\n     * @param factor scale factor to apply to v before adding it\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 440,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.add(double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 448,
      "end_line": 450,
      "comment": " Add a scaled vector to the instance.\n     * @param factor scale factor to apply to v before adding it\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.add(double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 457,
      "end_line": 461,
      "comment": " Add a scaled vector to the instance.\n     * @param factor scale factor to apply to v before adding it\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 460,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.subtract(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 467,
      "end_line": 469,
      "comment": " Subtract a vector from the instance.\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.subtract(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 475,
      "end_line": 477,
      "comment": " Subtract a vector from the instance.\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.subtract(T, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 484,
      "end_line": 486,
      "comment": " Subtract a scaled vector from the instance.\n     * @param factor scale factor to apply to v before subtracting it\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.subtract(T, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 493,
      "end_line": 497,
      "comment": " Subtract a scaled vector from the instance.\n     * @param factor scale factor to apply to v before subtracting it\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 496,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.subtract(double, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 504,
      "end_line": 506,
      "comment": " Subtract a scaled vector from the instance.\n     * @param factor scale factor to apply to v before subtracting it\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.subtract(double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 513,
      "end_line": 517,
      "comment": " Subtract a scaled vector from the instance.\n     * @param factor scale factor to apply to v before subtracting it\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.normalize()",
      "begin_line": 523,
      "end_line": 529,
      "comment": " Get a normalized vector aligned with the instance.\n     * @return a new normalized vector\n     * @exception MathArithmeticException if the norm is zero\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 30)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.orthogonal()",
      "begin_line": 546,
      "end_line": 564,
      "comment": " Get a vector orthogonal to the instance.\n     * \u003cp\u003eThere are an infinite number of normalized vectors orthogonal\n     * to the instance. This method picks up one of them almost\n     * arbitrarily. It is useful when one needs to compute a reference\n     * frame with one of the axes in a predefined direction. The\n     * following example shows how to build a frame having the k axis\n     * aligned with the known vector u :\n     * \u003cpre\u003e\u003ccode\u003e\n     *   Vector3D k \u003d u.normalize();\n     *   Vector3D i \u003d k.orthogonal();\n     *   Vector3D j \u003d Vector3D.crossProduct(k, i);\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * @return a new normalized vector orthogonal to the instance\n     * @exception MathArithmeticException if the norm of the instance is null\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 59)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 578,
      "end_line": 600,
      "comment": " Compute the angular separation between two vectors.\n     * \u003cp\u003eThis method computes the angular separation between two\n     * vectors using the dot product for well separated vectors and the\n     * cross product for almost aligned vectors. This allows to have a\n     * good accuracy in all cases, even for vectors very close to each\n     * other.\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return angular separation between v1 and v2\n     * @exception MathArithmeticException if either vector has a null norm\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 66)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 41)",
        "(line 587,col 9)-(line 587,col 64)",
        "(line 588,col 9)-(line 595,col 9)",
        "(line 598,col 9)-(line 598,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 614,
      "end_line": 636,
      "comment": " Compute the angular separation between two vectors.\n     * \u003cp\u003eThis method computes the angular separation between two\n     * vectors using the dot product for well separated vectors and the\n     * cross product for almost aligned vectors. This allows to have a\n     * good accuracy in all cases, even for vectors very close to each\n     * other.\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return angular separation between v1 and v2\n     * @exception MathArithmeticException if either vector has a null norm\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 66)",
        "(line 618,col 9)-(line 620,col 9)",
        "(line 622,col 9)-(line 622,col 41)",
        "(line 623,col 9)-(line 623,col 64)",
        "(line 624,col 9)-(line 631,col 9)",
        "(line 634,col 9)-(line 634,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 650,
      "end_line": 653,
      "comment": " Compute the angular separation between two vectors.\n     * \u003cp\u003eThis method computes the angular separation between two\n     * vectors using the dot product for well separated vectors and the\n     * cross product for almost aligned vectors. This allows to have a\n     * good accuracy in all cases, even for vectors very close to each\n     * other.\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return angular separation between v1 and v2\n     * @exception MathArithmeticException if either vector has a null norm\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.negate()",
      "begin_line": 658,
      "end_line": 660,
      "comment": " Get the opposite of the instance.\n     * @return a new vector which is opposite to the instance\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.scalarMultiply(T)",
      "begin_line": 666,
      "end_line": 668,
      "comment": " Multiply the instance by a scalar.\n     * @param a scalar\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.scalarMultiply(double)",
      "begin_line": 674,
      "end_line": 676,
      "comment": " Multiply the instance by a scalar.\n     * @param a scalar\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.isNaN()",
      "begin_line": 682,
      "end_line": 684,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.isInfinite()",
      "begin_line": 692,
      "end_line": 694,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 128)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.equals(java.lang.Object)",
      "begin_line": 715,
      "end_line": 733,
      "comment": "\n     * Test for the equality of two 3D vectors.\n     * \u003cp\u003e\n     * If all coordinates of two 3D vectors are exactly the same, and none of their\n     * {@link RealFieldElement#getReal() real part} are \u003ccode\u003eNaN\u003c/code\u003e, the\n     * two 3D vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) real part of the\n     * coordinates of the 3D vector are \u003ccode\u003eNaN\u003c/code\u003e, the 3D vector is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two 3D vector objects are equal, false if\n     *         object is null, not an instance of Vector3D, or\n     *         not equal to this Vector3D instance\n     *\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 720,col 9)",
        "(line 722,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.hashCode()",
      "begin_line": 742,
      "end_line": 748,
      "comment": "\n     * Get a hashCode for the 3D vector.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 760,
      "end_line": 762,
      "comment": " Compute the dot-product of the instance and another vector.\n     * \u003cp\u003e\n     * The implementation uses specific multiplication and addition\n     * algorithms to preserve accuracy and reduce cancellation effects.\n     * It should be very accurate even for nearly orthogonal vectors.\n     * \u003c/p\u003e\n     * @see MathArrays#linearCombination(double, double, double, double, double, double)\n     * @param v second vector\n     * @return the dot product this.v\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 774,
      "end_line": 776,
      "comment": " Compute the dot-product of the instance and another vector.\n     * \u003cp\u003e\n     * The implementation uses specific multiplication and addition\n     * algorithms to preserve accuracy and reduce cancellation effects.\n     * It should be very accurate even for nearly orthogonal vectors.\n     * \u003c/p\u003e\n     * @see MathArrays#linearCombination(double, double, double, double, double, double)\n     * @param v second vector\n     * @return the dot product this.v\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 782,
      "end_line": 786,
      "comment": " Compute the cross-product of the instance with another vector.\n     * @param v other vector\n     * @return the cross product this ^ v as a new Vector3D\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 785,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 792,
      "end_line": 796,
      "comment": " Compute the cross-product of the instance with another vector.\n     * @param v other vector\n     * @return the cross product this ^ v as a new Vector3D\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 795,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 805,
      "end_line": 810,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 43)",
        "(line 807,col 9)-(line 807,col 43)",
        "(line 808,col 9)-(line 808,col 43)",
        "(line 809,col 9)-(line 809,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 819,
      "end_line": 824,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 48)",
        "(line 821,col 9)-(line 821,col 48)",
        "(line 822,col 9)-(line 822,col 48)",
        "(line 823,col 9)-(line 823,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 833,
      "end_line": 838,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 37)",
        "(line 835,col 9)-(line 835,col 37)",
        "(line 836,col 9)-(line 836,col 37)",
        "(line 837,col 9)-(line 837,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 847,
      "end_line": 852,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 42)",
        "(line 849,col 9)-(line 849,col 42)",
        "(line 850,col 9)-(line 850,col 42)",
        "(line 851,col 9)-(line 851,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 861,
      "end_line": 878,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 43)",
        "(line 863,col 9)-(line 863,col 43)",
        "(line 864,col 9)-(line 864,col 43)",
        "(line 865,col 9)-(line 877,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 887,
      "end_line": 904,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 48)",
        "(line 889,col 9)-(line 889,col 48)",
        "(line 890,col 9)-(line 890,col 48)",
        "(line 891,col 9)-(line 903,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 913,
      "end_line": 918,
      "comment": " Compute the square of the distance between the instance and another vector.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the square of the distance between the instance and p\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 37)",
        "(line 915,col 9)-(line 915,col 37)",
        "(line 916,col 9)-(line 916,col 37)",
        "(line 917,col 9)-(line 917,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 927,
      "end_line": 932,
      "comment": " Compute the square of the distance between the instance and another vector.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the square of the distance between the instance and p\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 42)",
        "(line 929,col 9)-(line 929,col 42)",
        "(line 930,col 9)-(line 930,col 42)",
        "(line 931,col 9)-(line 931,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 940,
      "end_line": 943,
      "comment": " Compute the dot-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the dot product v1.v2\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 951,
      "end_line": 954,
      "comment": " Compute the dot-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the dot product v1.v2\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 962,
      "end_line": 965,
      "comment": " Compute the dot-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the dot product v1.v2\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 973,
      "end_line": 976,
      "comment": " Compute the cross-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the cross product v1 ^ v2 as a new Vector\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 984,
      "end_line": 987,
      "comment": " Compute the cross-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the cross product v1 ^ v2 as a new Vector\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 995,
      "end_line": 1000,
      "comment": " Compute the cross-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the cross product v1 ^ v2 as a new Vector\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 999,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 1011,
      "end_line": 1014,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 1025,
      "end_line": 1028,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1027,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 1039,
      "end_line": 1042,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 1053,
      "end_line": 1056,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 1067,
      "end_line": 1070,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 1069,col 9)-(line 1069,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 1081,
      "end_line": 1084,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 1083,col 9)-(line 1083,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 1095,
      "end_line": 1098,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 1097,col 9)-(line 1097,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 1109,
      "end_line": 1112,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 1123,
      "end_line": 1126,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 1137,
      "end_line": 1140,
      "comment": " Compute the square of the distance between two vectors.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the square of the distance between v1 and v2\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1139,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 1151,
      "end_line": 1154,
      "comment": " Compute the square of the distance between two vectors.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the square of the distance between v1 and v2\n     ",
      "child_ranges": [
        "(line 1153,col 9)-(line 1153,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 1165,
      "end_line": 1168,
      "comment": " Compute the square of the distance between two vectors.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @param \u003cT\u003e the type of the field elements\n     * @return the square of the distance between v1 and v2\n     ",
      "child_ranges": [
        "(line 1167,col 9)-(line 1167,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.toString()",
      "begin_line": 1173,
      "end_line": 1176,
      "comment": " Get a string representation of this vector.\n     * @return a string representation of this vector\n     ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D.toString(java.text.NumberFormat)",
      "begin_line": 1182,
      "end_line": 1184,
      "comment": " Get a string representation of this vector.\n     * @param format the custom format for components\n     * @return a string representation of this vector\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1183,col 63)"
      ]
    }
  ]
}