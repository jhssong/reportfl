{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/interpolation/MicrosphereInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MicrosphereInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.MultivariateRealFunction"
      ],
      "begin_line": 37,
      "end_line": 243,
      "comment": "\n * Interpolating function that implements the\n * \u003ca href\u003d\"http://www.dudziak.com/microsphere.php\"\u003eMicrosphere Projection\u003c/a\u003e.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Space dimension.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "microsphere"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Internal accounting data for the interpolation algorithm.\n     * Each element of the list corresponds to one surface element of\n     * the microsphere.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "brightnessExponent"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Exponent used in the power law that computes the weights of the\n     * sample data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "samples"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Sample data.\n     "
    },
    {
      "type": "class_interface",
      "name": "MicrosphereSurfaceElement",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 126,
      "comment": "\n     * Class for storing the accounting data needed to perform the\n     * microsphere projection.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "normal"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Normal vector characterizing a surface element. "
    },
    {
      "type": "field",
      "varNames": [
        "brightestIllumination"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Illumination received from the brightest sample. "
    },
    {
      "type": "field",
      "varNames": [
        "brightestSample"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Brightest sample. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.MicrosphereSurfaceElement(double[])",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n         * @param n Normal vector characterizing a surface element\n         * of the microsphere.\n         ",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.normal()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n         * Return the normal vector.\n         * @return the normal vector\n         ",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.reset()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n         * Reset \"illumination\" and \"sampleIndex\".\n         ",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 38)",
        "(line 95,col 13)-(line 95,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.store(double, java.util.Map.Entry\u003corg.apache.commons.math.linear.RealVector, java.lang.Double\u003e)",
      "begin_line": 103,
      "end_line": 109,
      "comment": "\n         * Store the illumination and index of the brightest sample.\n         * @param illuminationFromSample illumination received from sample\n         * @param sample current sample illuminating the element\n         ",
      "child_ranges": [
        "(line 105,col 13)-(line 108,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.illumination()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n         * Get the illumination of the element.\n         * @return the illumination.\n         ",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.sample()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n         * Get the sample illuminating the element the most.\n         * @return the sample.\n         ",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereInterpolatingFunction(double[][], double[], int, int, org.apache.commons.math.random.UnitSphereRandomVectorGenerator)",
      "begin_line": 146,
      "end_line": 181,
      "comment": "\n     * @param xval the arguments for the interpolation points.\n     * {@code xval[i][0]} is the first component of interpolation point\n     * {@code i}, {@code xval[i][1]} is the second component, and so on\n     * until {@code xval[i][d-1]}, the last component of that interpolation\n     * point (where {@code dimension} is thus the dimension of the sampled\n     * space).\n     * @param yval the values for the interpolation points\n     * @param brightnessExponent Brightness dimming factor.\n     * @param microsphereElements Number of surface elements of the\n     * microsphere.\n     * @param rand Unit vector generator for creating the microsphere.\n     * @throws DimensionMismatchException if the lengths of {@code yval} and\n     * {@code xval} (equal to {@code n}, the number of interpolation points)\n     * do not match, or the the arrays {@code xval[0]} ... {@code xval[n]},\n     * have lengths different from {@code dimension}.\n     * @throws IllegalArgumentException if there are no data (xval null or zero length)\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 35)",
        "(line 161,col 9)-(line 161,col 53)",
        "(line 164,col 9)-(line 164,col 63)",
        "(line 165,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 84)",
        "(line 177,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.value(double[])",
      "begin_line": 187,
      "end_line": 230,
      "comment": "\n     * @param point Interpolation point.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 56)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 217,col 25)",
        "(line 218,col 9)-(line 218,col 31)",
        "(line 219,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.cosAngle(org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Compute the cosine of the angle between 2 vectors.\n     *\n     * @param v Vector.\n     * @param w Vector.\n     * @return cosine of the angle\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 61)"
      ]
    }
  ]
}