{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/MultivariateFunctionMappingAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateFunctionMappingAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 81,
      "end_line": 295,
      "comment": "\n * \u003cp\u003eAdapter for mapping bounded {@link MultivariateFunction} to unbounded ones.\u003c/p\u003e\n *\n * \u003cp\u003e\n * This adapter can be used to wrap functions subject to simple bounds on\n * parameters so they can be used by optimizers that do \u003cem\u003enot\u003c/em\u003e directly\n * support simple bounds.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The principle is that the user function that will be wrapped will see its\n * parameters bounded as required, i.e when its {@code value} method is called\n * with argument array {@code point}, the elements array will fulfill requirement\n * {@code lower[i] \u003c\u003d point[i] \u003c\u003d upper[i]} for all i. Some of the components\n * may be unbounded or bounded only on one side if the corresponding bound is\n * set to an infinite value. The optimizer will not manage the user function by\n * itself, but it will handle this adapter and it is this adapter that will take\n * care the bounds are fulfilled. The adapter {@link #value(double[])} method will\n * be called by the optimizer with unbound parameters, and the adapter will map\n * the unbounded value to the bounded range using appropriate functions like\n * {@link Sigmoid} for double bounded elements for example.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As the optimizer sees only unbounded parameters, it should be noted that the\n * start point or simplex expected by the optimizer should be unbounded, so the\n * user is responsible for converting his bounded point to unbounded by calling\n * {@link #boundedToUnbounded(double[])} before providing them to the optimizer.\n * For the same reason, the point returned by the {@link\n * org.apache.commons.math3.optimization.BaseMultivariateOptimizer#optimize(int,\n * MultivariateFunction, org.apache.commons.math3.optimization.GoalType, double[])}\n * method is unbounded. So to convert this point to bounded, users must call\n * {@link #unboundedToBounded(double[])} by themselves!\u003c/p\u003e\n * \u003cp\u003e\n * This adapter is only a poor man solution to simple bounds optimization constraints\n * that can be used with simple optimizers like\n * {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer\n * SimplexOptimizer}.\n * A better solution is to use an optimizer that directly supports simple bounds like\n * {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer\n * CMAESOptimizer} or\n * {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer\n * BOBYQAOptimizer}.\n * One caveat of this poor-man\u0027s solution is that behavior near the bounds may be\n * numerically unstable as bounds are mapped from infinite values.\n * Another caveat is that convergence values are evaluated by the optimizer with\n * respect to unbounded variables, so there will be scales differences when\n * converted to bounded variables.\n * \u003c/p\u003e\n *\n * @see MultivariateFunctionPenaltyAdapter\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "bounded"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Underlying bounded function. "
    },
    {
      "type": "field",
      "varNames": [
        "mappers"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Mapping functions. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.MultivariateFunctionMappingAdapter(org.apache.commons.math3.analysis.MultivariateFunction, double[], double[])",
      "begin_line": 99,
      "end_line": 135,
      "comment": " Simple constructor.\n     * @param bounded bounded function\n     * @param lower lower bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.NEGATIVE_INFINITY} for\n     * unbounded values)\n     * @param upper upper bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.POSITIVE_INFINITY} for\n     * unbounded values)\n     * @exception DimensionMismatchException if lower and upper bounds are not\n     * consistent, either according to dimension or to values\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 38)",
        "(line 103,col 9)-(line 103,col 38)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 31)",
        "(line 115,col 9)-(line 115,col 48)",
        "(line 116,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.unboundedToBounded(double[])",
      "begin_line": 143,
      "end_line": 151,
      "comment": "\n     * Maps an array from unbounded to bounded.\n     *\n     * @param point Unbounded values.\n     * @return the bounded values.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 59)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.boundedToUnbounded(double[])",
      "begin_line": 159,
      "end_line": 167,
      "comment": "\n     * Maps an array from bounded to unbounded.\n     *\n     * @param point Bounded values.\n     * @return the unbounded values.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 59)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.value(double[])",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Compute the underlying function value from an unbounded point.\n     * \u003cp\u003e\n     * This method simply bounds the unbounded point using the mappings\n     * set up at construction and calls the underlying function using\n     * the bounded point.\n     * \u003c/p\u003e\n     * @param point unbounded value\n     * @return underlying function value\n     * @see #unboundedToBounded(double[])\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Mapper",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 185,
      "end_line": 201,
      "comment": " Mapping interface. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.Mapper.unboundedToBounded(double)",
      "begin_line": 192,
      "end_line": 192,
      "comment": "\n         * Maps a value from unbounded to bounded.\n         *\n         * @param y Unbounded value.\n         * @return the bounded value.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.Mapper.boundedToUnbounded(double)",
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n         * Maps a value from bounded to unbounded.\n         *\n         * @param x Bounded value.\n         * @return the unbounded value.\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NoBoundsMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 204,
      "end_line": 214,
      "comment": " Local class for no bounds mapping. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.NoBoundsMapper.unboundedToBounded(double)",
      "begin_line": 206,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.NoBoundsMapper.boundedToUnbounded(double)",
      "begin_line": 211,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LowerBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 217,
      "end_line": 240,
      "comment": " Local class for lower bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " Low bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.LowerBoundMapper.LowerBoundMapper(double)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n         * Simple constructor.\n         *\n         * @param lower lower bound\n         ",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.LowerBoundMapper.unboundedToBounded(double)",
      "begin_line": 231,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.LowerBoundMapper.boundedToUnbounded(double)",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UpperBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 243,
      "end_line": 265,
      "comment": " Local class for upper bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Upper bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.UpperBoundMapper.UpperBoundMapper(double)",
      "begin_line": 251,
      "end_line": 253,
      "comment": " Simple constructor.\n         * @param upper upper bound\n         ",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.UpperBoundMapper.unboundedToBounded(double)",
      "begin_line": 256,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.UpperBoundMapper.boundedToUnbounded(double)",
      "begin_line": 261,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LowerUpperBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 268,
      "end_line": 294,
      "comment": " Local class for lower and bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "boundingFunction"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " Function from unbounded to bounded. "
    },
    {
      "type": "field",
      "varNames": [
        "unboundingFunction"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " Function from bounded to unbounded. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper.LowerUpperBoundMapper(double, double)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n         * Simple constructor.\n         *\n         * @param lower lower bound\n         * @param upper upper bound\n         ",
      "child_ranges": [
        "(line 281,col 13)-(line 281,col 59)",
        "(line 282,col 13)-(line 282,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper.unboundedToBounded(double)",
      "begin_line": 286,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper.boundedToUnbounded(double)",
      "begin_line": 291,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 47)"
      ]
    }
  ]
}