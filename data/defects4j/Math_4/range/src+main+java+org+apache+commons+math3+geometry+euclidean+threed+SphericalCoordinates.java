{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/SphericalCoordinates.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SphericalCoordinates",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 396,
      "comment": " This class provides conversions related to \u003ca\n * href\u003d\"http://mathworld.wolfram.com/SphericalCoordinates.html\"\u003espherical coordinates\u003c/a\u003e.\n * \u003cp\u003e\n * The conventions used here are the mathematical ones, i.e. spherical coordinates are\n * related to Cartesian coordinates as follows:\n * \u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ex \u003d r cos(\u0026theta;) sin(\u0026Phi;)\u003c/li\u003e\n *   \u003cli\u003ey \u003d r sin(\u0026theta;) sin(\u0026Phi;)\u003c/li\u003e\n *   \u003cli\u003ez \u003d r cos(\u0026Phi;)\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cul\u003e\n *   \u003cli\u003er       \u003d \u0026radic;(x\u003csup\u003e2\u003c/sup\u003e+y\u003csup\u003e2\u003c/sup\u003e+z\u003csup\u003e2\u003c/sup\u003e)\u003c/li\u003e\n *   \u003cli\u003e\u0026theta; \u003d atan2(y, x)\u003c/li\u003e\n *   \u003cli\u003e\u0026Phi;   \u003d acos(z/r)\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * r is the radius, \u0026theta; is the azimuthal angle in the x-y plane and \u0026Phi; is the polar\n * (co-latitude) angle. These conventions are \u003cem\u003edifferent\u003c/em\u003e from the conventions used\n * in physics (and in particular in spherical harmonics) where the meanings of \u0026theta; and\n * \u0026Phi; are reversed.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class provides conversion of coordinates and also of gradient and Hessian\n * between spherical and Cartesian coordinates.\n * \u003c/p\u003e\n * @since 3.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Cartesian coordinates. "
    },
    {
      "type": "field",
      "varNames": [
        "r"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Radius. "
    },
    {
      "type": "field",
      "varNames": [
        "theta"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Azimuthal angle in the x-y plane \u0026theta;. "
    },
    {
      "type": "field",
      "varNames": [
        "phi"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Polar angle (co-latitude) \u0026Phi;. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Jacobian of (r, \u0026theta; \u0026Phi). "
    },
    {
      "type": "field",
      "varNames": [
        "rHessian"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Hessian of radius. "
    },
    {
      "type": "field",
      "varNames": [
        "thetaHessian"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Hessian of azimuthal angle in the x-y plane \u0026theta;. "
    },
    {
      "type": "field",
      "varNames": [
        "phiHessian"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Hessian of polar (co-latitude) angle \u0026Phi;. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.SphericalCoordinates(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 85,
      "end_line": 95,
      "comment": " Build a spherical coordinates transformer from Cartesian coordinates.\n     * @param v Cartesian coordinates\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 19)",
        "(line 91,col 9)-(line 91,col 33)",
        "(line 92,col 9)-(line 92,col 34)",
        "(line 93,col 9)-(line 93,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.SphericalCoordinates(double, double, double)",
      "begin_line": 102,
      "end_line": 119,
      "comment": " Build a spherical coordinates transformer from spherical coordinates.\n     * @param r radius\n     * @param theta azimuthal angle in x-y plane\n     * @param phi polar (co-latitude) angle\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 52)",
        "(line 105,col 9)-(line 105,col 52)",
        "(line 106,col 9)-(line 106,col 50)",
        "(line 107,col 9)-(line 107,col 50)",
        "(line 110,col 9)-(line 110,col 23)",
        "(line 111,col 9)-(line 111,col 27)",
        "(line 112,col 9)-(line 112,col 25)",
        "(line 115,col 9)-(line 117,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.getCartesian()",
      "begin_line": 124,
      "end_line": 126,
      "comment": " Get the Cartesian coordinates.\n     * @return Cartesian coordinates\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.getR()",
      "begin_line": 133,
      "end_line": 135,
      "comment": " Get the radius.\n     * @return radius r\n     * @see #getTheta()\n     * @see #getPhi()\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.getTheta()",
      "begin_line": 142,
      "end_line": 144,
      "comment": " Get the azimuthal angle in x-y plane.\n     * @return azimuthal angle in x-y plane \u0026theta;\n     * @see #getR()\n     * @see #getPhi()\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.getPhi()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " Get the polar (co-latitude) angle.\n     * @return polar (co-latitude) angle \u0026Phi;\n     * @see #getR()\n     * @see #getTheta()\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.toCartesianGradient(double[])",
      "begin_line": 162,
      "end_line": 175,
      "comment": " Convert a gradient with respect to spherical coordinates into a gradient\n     * with respect to Cartesian coordinates.\n     * @param sGradient gradient with respect to spherical coordinates\n     * {df/dr, df/d\u0026theta;, df/d\u0026Phi;}\n     * @return gradient with respect to Cartesian coordinates\n     * {df/dx, df/dy, df/dz}\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 26)",
        "(line 169,col 9)-(line 173,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.toCartesianHessian(double[][], double[])",
      "begin_line": 195,
      "end_line": 241,
      "comment": " Convert a Hessian with respect to spherical coordinates into a Hessian\n     * with respect to Cartesian coordinates.\n     * \u003cp\u003e\n     * As Hessian are always symmetric, we use only the lower left part of the provided\n     * spherical Hessian, so the upper part may not be initialized. However, we still\n     * do fill up the complete array we create, with guaranteed symmetry.\n     * \u003c/p\u003e\n     * @param sHessian Hessian with respect to spherical coordinates\n     * {{d\u003csup\u003e2\u003c/sup\u003ef/dr\u003csup\u003e2\u003c/sup\u003e, d\u003csup\u003e2\u003c/sup\u003ef/drd\u0026theta;, d\u003csup\u003e2\u003c/sup\u003ef/drd\u0026Phi;},\n     *  {d\u003csup\u003e2\u003c/sup\u003ef/drd\u0026theta;, d\u003csup\u003e2\u003c/sup\u003ef/d\u0026theta;\u003csup\u003e2\u003c/sup\u003e, d\u003csup\u003e2\u003c/sup\u003ef/d\u0026theta;d\u0026Phi;},\n     *  {d\u003csup\u003e2\u003c/sup\u003ef/drd\u0026Phi;, d\u003csup\u003e2\u003c/sup\u003ef/d\u0026theta;d\u0026Phi;, d\u003csup\u003e2\u003c/sup\u003ef/d\u0026Phi;\u003csup\u003e2\u003c/sup\u003e}\n     * @param sGradient gradient with respect to spherical coordinates\n     * {df/dr, df/d\u0026theta;, df/d\u0026Phi;}\n     * @return Hessian with respect to Cartesian coordinates\n     * {{d\u003csup\u003e2\u003c/sup\u003ef/dx\u003csup\u003e2\u003c/sup\u003e, d\u003csup\u003e2\u003c/sup\u003ef/dxdy, d\u003csup\u003e2\u003c/sup\u003ef/dxdz},\n     *  {d\u003csup\u003e2\u003c/sup\u003ef/dxdy, d\u003csup\u003e2\u003c/sup\u003ef/dy\u003csup\u003e2\u003c/sup\u003e, d\u003csup\u003e2\u003c/sup\u003ef/dydz},\n     *  {d\u003csup\u003e2\u003c/sup\u003ef/dxdz, d\u003csup\u003e2\u003c/sup\u003ef/dydz, d\u003csup\u003e2\u003c/sup\u003ef/dz\u003csup\u003e2\u003c/sup\u003e}}\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 26)",
        "(line 198,col 9)-(line 198,col 26)",
        "(line 203,col 9)-(line 203,col 47)",
        "(line 204,col 9)-(line 204,col 53)",
        "(line 208,col 9)-(line 208,col 119)",
        "(line 209,col 9)-(line 209,col 119)",
        "(line 210,col 9)-(line 210,col 119)",
        "(line 211,col 9)-(line 211,col 119)",
        "(line 212,col 9)-(line 212,col 119)",
        "(line 214,col 9)-(line 214,col 119)",
        "(line 215,col 9)-(line 215,col 119)",
        "(line 216,col 9)-(line 216,col 119)",
        "(line 219,col 9)-(line 219,col 107)",
        "(line 220,col 9)-(line 220,col 107)",
        "(line 221,col 9)-(line 221,col 107)",
        "(line 222,col 9)-(line 222,col 107)",
        "(line 223,col 9)-(line 223,col 107)",
        "(line 224,col 9)-(line 224,col 107)",
        "(line 227,col 9)-(line 227,col 126)",
        "(line 228,col 9)-(line 228,col 126)",
        "(line 229,col 9)-(line 229,col 126)",
        "(line 230,col 9)-(line 230,col 126)",
        "(line 231,col 9)-(line 231,col 126)",
        "(line 232,col 9)-(line 232,col 126)",
        "(line 235,col 9)-(line 235,col 40)",
        "(line 236,col 9)-(line 236,col 40)",
        "(line 237,col 9)-(line 237,col 40)",
        "(line 239,col 9)-(line 239,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.computeJacobian()",
      "begin_line": 245,
      "end_line": 274,
      "comment": " Lazy evaluation of (r, \u0026theta;, \u0026phi;) Jacobian.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.computeHessians()",
      "begin_line": 278,
      "end_line": 345,
      "comment": " Lazy evaluation of Hessians.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.writeReplace()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 356,
      "end_line": 394,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " Abscissa.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Ordinate.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " Height.\n         * @serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.DataTransferObject.DataTransferObject(double, double, double)",
      "begin_line": 381,
      "end_line": 385,
      "comment": " Simple constructor.\n         * @param x abscissa\n         * @param y ordinate\n         * @param z height\n         ",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 23)",
        "(line 383,col 13)-(line 383,col 23)",
        "(line 384,col 13)-(line 384,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinates.DataTransferObject.readResolve()",
      "begin_line": 390,
      "end_line": 392,
      "comment": " Replace the deserialized data transfer object with a {@link SphericalCoordinates}.\n         * @return replacement {@link SphericalCoordinates}\n         ",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 67)"
      ]
    }
  ]
}