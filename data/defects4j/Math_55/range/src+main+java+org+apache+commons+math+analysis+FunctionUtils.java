{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 177,
      "comment": "\n * Utilities for manipulating function objects.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-b3313a19-1811-4abc-a957-9506ae40d922.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-2b45b1cd-29cd-4ea2-a974-4bcbbdf2cd8a.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-a6588dd7-706d-4b61-94b8-c86038e801eb.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-162046c5-7a8c-4d50-aa0c-455d01ea90d3.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-48fdd18e-e1ad-4bdc-9a0e-e2ad54c35008.value(double[])",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-6d66d381-ad72-4d0a-a4ef-2c8b93717799.value(double)",
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
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-9b2ed3eb-4b87-4b05-a6fa-ff53456dce1e.value(double)",
      "begin_line": 172,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 17)-(line 173,col 41)"
      ]
    }
  ]
}