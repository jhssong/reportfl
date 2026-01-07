{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/optimization/direct/MultivariateRealFunctionMappingAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateRealFunctionMappingAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.MultivariateRealFunction"
      ],
      "begin_line": 79,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bounded"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Underlying bounded function. "
    },
    {
      "type": "field",
      "varNames": [
        "mappers"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Mapping functions. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.MultivariateRealFunctionMappingAdapter(org.apache.commons.math.analysis.MultivariateRealFunction, double[], double[])",
      "begin_line": 98,
      "end_line": 136,
      "comment": " Simple constructor.\n     * @param bounded bounded function\n     * @param lower lower bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.NEGATIVE_INFINITY} for\n     * unbounded values)\n     * @param upper upper bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.POSITIVE_INFINITY} for\n     * unbounded values)\n     * @exception MathIllegalArgumentException if lower and upper bounds are not\n     * consistent, either according to dimension or to values\n     ",
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
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.unboundedToBounded(double[])",
      "begin_line": 142,
      "end_line": 152,
      "comment": " Map an array from unbounded to bounded.\n     * @param point unbounded value\n     * @return bounded value\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 59)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.boundedToUnbounded(double[])",
      "begin_line": 159,
      "end_line": 170,
      "comment": " \n     * Map an array from bounded to unbounded.\n     * @param point bounded value\n     * @return unbounded value\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 59)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 168,col 9)-(line 168,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.value(double[])",
      "begin_line": 180,
      "end_line": 182,
      "comment": " Compute the underlying function value from an unbounded point.\n     * \u003cp\u003e\n     * This method simply bounds the unbounded point using the mappings\n     * set up at construction and calls the underlying function using\n     * the bounded point.\n     * \u003c/p\u003e\n     * @see #unboundedToBounded(double[])\n     ",
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
      "end_line": 199,
      "comment": " Mapping interface. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper.unboundedToBounded(double)",
      "begin_line": 191,
      "end_line": 191,
      "comment": " Map a value from unbounded to bounded.\n         * @param y unbounded value\n         * @return bounded value\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper.boundedToUnbounded(double)",
      "begin_line": 197,
      "end_line": 197,
      "comment": " Map a value from bounded to unbounded.\n         * @param x bounded value\n         * @return unbounded value\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NoBoundsMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 202,
      "end_line": 219,
      "comment": " Local class for no bounds mapping. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.NoBoundsMapper.NoBoundsMapper()",
      "begin_line": 206,
      "end_line": 207,
      "comment": " Simple constructor.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.NoBoundsMapper.unboundedToBounded(double)",
      "begin_line": 210,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.NoBoundsMapper.boundedToUnbounded(double)",
      "begin_line": 215,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LowerBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 222,
      "end_line": 244,
      "comment": " Local class for lower bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": " Low bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.LowerBoundMapper.LowerBoundMapper(double)",
      "begin_line": 230,
      "end_line": 232,
      "comment": " Simple constructor.\n         * @param lower lower bound\n         ",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.LowerBoundMapper.unboundedToBounded(double)",
      "begin_line": 235,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.LowerBoundMapper.boundedToUnbounded(double)",
      "begin_line": 240,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UpperBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 247,
      "end_line": 269,
      "comment": " Local class for upper bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " Upper bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.UpperBoundMapper.UpperBoundMapper(double)",
      "begin_line": 255,
      "end_line": 257,
      "comment": " Simple constructor.\n         * @param upper upper bound\n         ",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.UpperBoundMapper.unboundedToBounded(double)",
      "begin_line": 260,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.UpperBoundMapper.boundedToUnbounded(double)",
      "begin_line": 265,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LowerUpperBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 272,
      "end_line": 299,
      "comment": " Local class for lower and bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "boundingFunction"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": " Function from unbounded to bounded. "
    },
    {
      "type": "field",
      "varNames": [
        "unboundingFunction"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": " Function from bounded to unbounded. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.LowerUpperBoundMapper.LowerUpperBoundMapper(double, double)",
      "begin_line": 284,
      "end_line": 287,
      "comment": " Simple constructor.\n         * @param lower lower bound\n         * @param upper upper bound\n         ",
      "child_ranges": [
        "(line 285,col 13)-(line 285,col 59)",
        "(line 286,col 13)-(line 286,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.LowerUpperBoundMapper.unboundedToBounded(double)",
      "begin_line": 290,
      "end_line": 292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateRealFunctionMappingAdapter.LowerUpperBoundMapper.boundedToUnbounded(double)",
      "begin_line": 295,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 47)"
      ]
    }
  ]
}