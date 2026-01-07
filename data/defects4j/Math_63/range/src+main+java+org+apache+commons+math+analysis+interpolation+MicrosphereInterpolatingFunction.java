{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/analysis/interpolation/MicrosphereInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MicrosphereInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.MultivariateRealFunction"
      ],
      "begin_line": 38,
      "end_line": 244,
      "comment": "\n * Interpolating function that implements the\n * \u003ca href\u003d\"http://www.dudziak.com/microsphere.php\"\u003eMicrosphere Projection\u003c/a\u003e.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Space dimension.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "microsphere"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Internal accounting data for the interpolation algorithm.\n     * Each element of the list corresponds to one surface element of\n     * the microsphere.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "brightnessExponent"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Exponent used in the power law that computes the weights of the\n     * sample data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "samples"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Sample data.\n     "
    },
    {
      "type": "class_interface",
      "name": "MicrosphereSurfaceElement",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 127,
      "comment": "\n     * Class for storing the accounting data needed to perform the\n     * microsphere projection.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "normal"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Normal vector characterizing a surface element. "
    },
    {
      "type": "field",
      "varNames": [
        "brightestIllumination"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Illumination received from the brightest sample. "
    },
    {
      "type": "field",
      "varNames": [
        "brightestSample"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Brightest sample. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.MicrosphereSurfaceElement(double[])",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n         * @param n Normal vector characterizing a surface element\n         * of the microsphere.\n         ",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.normal()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n         * Return the normal vector.\n         * @return the normal vector\n         ",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.reset()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n         * Reset \"illumination\" and \"sampleIndex\".\n         ",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 38)",
        "(line 96,col 13)-(line 96,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.store(double, java.util.Map.Entry\u003corg.apache.commons.math.linear.RealVector, java.lang.Double\u003e)",
      "begin_line": 104,
      "end_line": 110,
      "comment": "\n         * Store the illumination and index of the brightest sample.\n         * @param illuminationFromSample illumination received from sample\n         * @param sample current sample illuminating the element\n         ",
      "child_ranges": [
        "(line 106,col 13)-(line 109,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.illumination()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n         * Get the illumination of the element.\n         * @return the illumination.\n         ",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.sample()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n         * Get the sample illuminating the element the most.\n         * @return the sample.\n         ",
      "child_ranges": [
        "(line 125,col 13)-(line 125,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereInterpolatingFunction(double[][], double[], int, int, org.apache.commons.math.random.UnitSphereRandomVectorGenerator)",
      "begin_line": 147,
      "end_line": 182,
      "comment": "\n     * @param xval the arguments for the interpolation points.\n     * {@code xval[i][0]} is the first component of interpolation point\n     * {@code i}, {@code xval[i][1]} is the second component, and so on\n     * until {@code xval[i][d-1]}, the last component of that interpolation\n     * point (where {@code dimension} is thus the dimension of the sampled\n     * space).\n     * @param yval the values for the interpolation points\n     * @param brightnessExponent Brightness dimming factor.\n     * @param microsphereElements Number of surface elements of the\n     * microsphere.\n     * @param rand Unit vector generator for creating the microsphere.\n     * @throws DimensionMismatchException if the lengths of {@code yval} and\n     * {@code xval} (equal to {@code n}, the number of interpolation points)\n     * do not match, or the the arrays {@code xval[0]} ... {@code xval[n]},\n     * have lengths different from {@code dimension}.\n     * @throws NoDataException if there are no data (xval null or zero length)\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 35)",
        "(line 162,col 9)-(line 162,col 53)",
        "(line 165,col 9)-(line 165,col 63)",
        "(line 166,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 84)",
        "(line 178,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.value(double[])",
      "begin_line": 188,
      "end_line": 231,
      "comment": "\n     * @param point Interpolation point.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 56)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 198,col 9)-(line 215,col 9)",
        "(line 218,col 9)-(line 218,col 25)",
        "(line 219,col 9)-(line 219,col 31)",
        "(line 220,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.cosAngle(org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Compute the cosine of the angle between 2 vectors.\n     *\n     * @param v Vector.\n     * @param w Vector.\n     * @return cosine of the angle\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 61)"
      ]
    }
  ]
}