{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/analysis/FunctionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 184,
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
      "begin_line": 42,
      "end_line": 53,
      "comment": "\n     * Compose functions.  The functions in the argument list are composed\n     * sequentially, in the order given.  For example, compose(f1,f2,f3)\n     * acts like f1(f2(f3(x))).\n     *\n     * @param f List of functions.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 52,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-1b806624-1dec-466e-8783-ec6844b64617.value(double)",
      "begin_line": 45,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 46,col 17)-(line 46,col 29)",
        "(line 47,col 17)-(line 49,col 17)",
        "(line 50,col 17)-(line 50,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.add(org.apache.commons.math.analysis.UnivariateRealFunction...)",
      "begin_line": 61,
      "end_line": 72,
      "comment": "\n     * Add functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the sum of the functions.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 71,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-22738d49-d916-4dca-943f-551860de500c.value(double)",
      "begin_line": 64,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 17)-(line 65,col 41)",
        "(line 66,col 17)-(line 68,col 17)",
        "(line 69,col 17)-(line 69,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.multiply(org.apache.commons.math.analysis.UnivariateRealFunction...)",
      "begin_line": 80,
      "end_line": 91,
      "comment": "\n     * Multiply functions.\n     *\n     * @param f List of functions.\n     * @return a function that computes the product of the functions.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 90,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-e2435055-5134-4a60-8874-f5c8b164cdce.value(double)",
      "begin_line": 83,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 17)-(line 84,col 41)",
        "(line 85,col 17)-(line 87,col 17)",
        "(line 88,col 17)-(line 88,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.combine(org.apache.commons.math.analysis.BivariateRealFunction, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 102,
      "end_line": 111,
      "comment": "\n     * Returns the univariate function \u003cbr/\u003e\n     * {@code h(x) \u003d combiner(f(x), g(x))}.\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param g Function.\n     * @return the composite function.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 110,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-4518037a-3266-4f9c-a6ed-d1134c2ea951.value(double)",
      "begin_line": 107,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 17)-(line 108,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.collector(org.apache.commons.math.analysis.BivariateRealFunction, org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 123,
      "end_line": 136,
      "comment": "\n     * Returns a MultivariateRealFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param f Function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 135,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-61788cb6-40ec-44fe-b71a-e3b81f6a0411.value(double[])",
      "begin_line": 128,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 17)-(line 129,col 80)",
        "(line 130,col 17)-(line 132,col 17)",
        "(line 133,col 17)-(line 133,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.collector(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * Returns a MultivariateRealFunction h(x[]) defined by \u003cpre\u003e \u003ccode\u003e\n     * h(x[]) \u003d combiner(...combiner(combiner(initialValue,x[0]),x[1])...),x[x.length-1])\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param combiner Combiner function.\n     * @param initialValue Initial value.\n     * @return a collector function.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.fix1stArgument(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 159,
      "end_line": 167,
      "comment": "\n     * Create a unary function by fixing the first argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the first argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(fixed, x)\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 166,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-6421235d-aa4e-47df-9767-209721a318b9.value(double)",
      "begin_line": 163,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 17)-(line 164,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.fix2ndArgument(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 175,
      "end_line": 183,
      "comment": "\n     * Create a unary function by fixing the second argument of a binary function.\n     *\n     * @param f Binary function.\n     * @param fixed Value to which the second argument of {@code f} is set.\n     * @return the unary function h(x) \u003d f(x, fixed)\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 182,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.FunctionUtils.Anonymous-d15ad110-0e31-411e-a313-f1a8ac189fa4.value(double)",
      "begin_line": 179,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 17)-(line 180,col 41)"
      ]
    }
  ]
}