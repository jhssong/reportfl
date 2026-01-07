{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 177,
      "comment": "\n * Utilities for manipulating function objects.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.FunctionUtils()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Class only contains static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.compose(org.apache.commons.math.analysis.UnivariateRealFunction...)",
      "begin_line": 40,
      "end_line": 51,
      "comment": "\n     * Compose functions.\n     *\n     * @param f List of functions.\n     * @return the composed function.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 50,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-5e3af006-9efc-4444-a7a0-39f7f43c85e8.value(double)",
      "begin_line": 43,
      "end_line": 49,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 44,col 17)-(line 44,col 29)",
        "(line 45,col 17)-(line 47,col 17)",
        "(line 48,col 17)-(line 48,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.add(org.apache.commons.math.analysis.UnivariateRealFunction...)",
      "begin_line": 59,
      "end_line": 70,
      "comment": "\n     * Add functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the addition of the functions.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 69,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-14142eaf-c221-4f24-bb99-decd896931e2.value(double)",
      "begin_line": 62,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 17)-(line 63,col 41)",
        "(line 64,col 17)-(line 66,col 17)",
        "(line 67,col 17)-(line 67,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.multiply(org.apache.commons.math.analysis.UnivariateRealFunction...)",
      "begin_line": 78,
      "end_line": 89,
      "comment": "\n     * Multiply functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the multiplication of the functions.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 88,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-d5dda4d9-2e3d-4894-935f-2b46a2be2b32.value(double)",
      "begin_line": 81,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 17)-(line 82,col 41)",
        "(line 83,col 17)-(line 85,col 17)",
        "(line 86,col 17)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.combine(org.apache.commons.math.analysis.BivariateRealFunction, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 99,
      "end_line": 108,
      "comment": "\n     * Combine functions.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composed function.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 107,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-936fe38a-0772-4022-ba28-a7615b2c90bc.value(double)",
      "begin_line": 104,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 17)-(line 105,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.collector(org.apache.commons.math.analysis.BivariateRealFunction, org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 118,
      "end_line": 131,
      "comment": "\n     * Generate a collector function.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 130,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-47efca9c-7d23-484b-81fe-339a99b95906.value(double[])",
      "begin_line": 123,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 17)-(line 124,col 80)",
        "(line 125,col 17)-(line 127,col 17)",
        "(line 128,col 17)-(line 128,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.collector(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * Generate a collector function.\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 152,
      "end_line": 160,
      "comment": "\n     * Create a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return a unary function.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 159,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-a67f7c44-6a44-4fb7-8f01-5bcf1f2d860c.value(double)",
      "begin_line": 156,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 17)-(line 157,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 168,
      "end_line": 176,
      "comment": "\n     * Create a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return a unary function.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 175,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-13298ed0-ff90-4c99-abad-36f5359401ca.value(double)",
      "begin_line": 172,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 17)-(line 173,col 41)"
      ]
    }
  ]
}