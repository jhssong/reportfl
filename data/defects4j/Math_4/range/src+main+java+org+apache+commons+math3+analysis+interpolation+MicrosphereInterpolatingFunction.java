{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/MicrosphereInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MicrosphereInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 39,
      "end_line": 251,
      "comment": "\n * Interpolating function that implements the\n * \u003ca href\u003d\"http://www.dudziak.com/microsphere.php\"\u003eMicrosphere Projection\u003c/a\u003e.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Space dimension.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "microsphere"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Internal accounting data for the interpolation algorithm.\n     * Each element of the list corresponds to one surface element of\n     * the microsphere.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "brightnessExponent"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Exponent used in the power law that computes the weights of the\n     * sample data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "samples"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Sample data.\n     "
    },
    {
      "type": "class_interface",
      "name": "MicrosphereSurfaceElement",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 65,
      "end_line": 125,
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
      "begin_line": 69,
      "end_line": 69,
      "comment": " Illumination received from the brightest sample. "
    },
    {
      "type": "field",
      "varNames": [
        "brightestSample"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Brightest sample. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.MicrosphereSurfaceElement(double[])",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n         * @param n Normal vector characterizing a surface element\n         * of the microsphere.\n         ",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.normal()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n         * Return the normal vector.\n         * @return the normal vector\n         ",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.reset()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n         * Reset \"illumination\" and \"sampleIndex\".\n         ",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 38)",
        "(line 94,col 13)-(line 94,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.store(double, java.util.Map.Entry\u003corg.apache.commons.math3.linear.RealVector, java.lang.Double\u003e)",
      "begin_line": 102,
      "end_line": 108,
      "comment": "\n         * Store the illumination and index of the brightest sample.\n         * @param illuminationFromSample illumination received from sample\n         * @param sample current sample illuminating the element\n         ",
      "child_ranges": [
        "(line 104,col 13)-(line 107,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.illumination()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n         * Get the illumination of the element.\n         * @return the illumination.\n         ",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereSurfaceElement.sample()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n         * Get the sample illuminating the element the most.\n         * @return the sample.\n         ",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.MicrosphereInterpolatingFunction(double[][], double[], int, int, org.apache.commons.math3.random.UnitSphereRandomVectorGenerator)",
      "begin_line": 146,
      "end_line": 191,
      "comment": "\n     * @param xval Arguments for the interpolation points.\n     * {@code xval[i][0]} is the first component of interpolation point\n     * {@code i}, {@code xval[i][1]} is the second component, and so on\n     * until {@code xval[i][d-1]}, the last component of that interpolation\n     * point (where {@code dimension} is thus the dimension of the sampled\n     * space).\n     * @param yval Values for the interpolation points.\n     * @param brightnessExponent Brightness dimming factor.\n     * @param microsphereElements Number of surface elements of the\n     * microsphere.\n     * @param rand Unit vector generator for creating the microsphere.\n     * @throws DimensionMismatchException if the lengths of {@code yval} and\n     * {@code xval} (equal to {@code n}, the number of interpolation points)\n     * do not match, or the the arrays {@code xval[0]} ... {@code xval[n]},\n     * have lengths different from {@code dimension}.\n     * @throws NoDataException if there an array has zero-length.\n     * @throws NullArgumentException if an argument is {@code null}.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 35)",
        "(line 169,col 9)-(line 169,col 53)",
        "(line 172,col 9)-(line 172,col 63)",
        "(line 173,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 84)",
        "(line 188,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.value(double[])",
      "begin_line": 198,
      "end_line": 239,
      "comment": "\n     * @param point Interpolation point.\n     * @return the interpolated value.\n     * @throws DimensionMismatchException if point dimension does not math sample\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 56)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 207,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 25)",
        "(line 228,col 9)-(line 228,col 31)",
        "(line 229,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction.cosAngle(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Compute the cosine of the angle between 2 vectors.\n     *\n     * @param v Vector.\n     * @param w Vector.\n     * @return the cosine of the angle between {@code v} and {@code w}.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 61)"
      ]
    }
  ]
}