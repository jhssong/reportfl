{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/direct/MultivariateFunctionMappingAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateFunctionMappingAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 79,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bounded"
      ],
      "begin_line": 83,
      "end_line": 83,
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
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.MultivariateFunctionMappingAdapter(org.apache.commons.math3.analysis.MultivariateFunction, double[], double[])",
      "begin_line": 99,
      "end_line": 137,
      "comment": " Simple constructor.\n     * @param bounded bounded function\n     * @param lower lower bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.NEGATIVE_INFINITY} for\n     * unbounded values)\n     * @param upper upper bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.POSITIVE_INFINITY} for\n     * unbounded values)\n     * @exception DimensionMismatchException if lower and upper bounds are not\n     * consistent, either according to dimension or to values\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 38)",
        "(line 104,col 9)-(line 104,col 38)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 31)",
        "(line 116,col 9)-(line 116,col 48)",
        "(line 117,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.unboundedToBounded(double[])",
      "begin_line": 143,
      "end_line": 153,
      "comment": " Map an array from unbounded to bounded.\n     * @param point unbounded value\n     * @return bounded value\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 59)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.boundedToUnbounded(double[])",
      "begin_line": 159,
      "end_line": 169,
      "comment": " Map an array from bounded to unbounded.\n     * @param point bounded value\n     * @return unbounded value\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 59)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.value(double[])",
      "begin_line": 181,
      "end_line": 183,
      "comment": " Compute the underlying function value from an unbounded point.\n     * \u003cp\u003e\n     * This method simply bounds the unbounded point using the mappings\n     * set up at construction and calls the underlying function using\n     * the bounded point.\n     * \u003c/p\u003e\n     * @param point unbounded value\n     * @return underlying function value\n     * @see #unboundedToBounded(double[])\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Mapper",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 186,
      "end_line": 200,
      "comment": " Mapping interface. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper.unboundedToBounded(double)",
      "begin_line": 192,
      "end_line": 192,
      "comment": " Map a value from unbounded to bounded.\n         * @param y unbounded value\n         * @return bounded value\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper.boundedToUnbounded(double)",
      "begin_line": 198,
      "end_line": 198,
      "comment": " Map a value from bounded to unbounded.\n         * @param x bounded value\n         * @return unbounded value\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NoBoundsMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 203,
      "end_line": 220,
      "comment": " Local class for no bounds mapping. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.NoBoundsMapper.NoBoundsMapper()",
      "begin_line": 207,
      "end_line": 208,
      "comment": " Simple constructor.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.NoBoundsMapper.unboundedToBounded(double)",
      "begin_line": 211,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.NoBoundsMapper.boundedToUnbounded(double)",
      "begin_line": 216,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LowerBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 223,
      "end_line": 245,
      "comment": " Local class for lower bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " Low bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.LowerBoundMapper.LowerBoundMapper(double)",
      "begin_line": 231,
      "end_line": 233,
      "comment": " Simple constructor.\n         * @param lower lower bound\n         ",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.LowerBoundMapper.unboundedToBounded(double)",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.LowerBoundMapper.boundedToUnbounded(double)",
      "begin_line": 241,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UpperBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 248,
      "end_line": 270,
      "comment": " Local class for upper bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " Upper bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.UpperBoundMapper.UpperBoundMapper(double)",
      "begin_line": 256,
      "end_line": 258,
      "comment": " Simple constructor.\n         * @param upper upper bound\n         ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.UpperBoundMapper.unboundedToBounded(double)",
      "begin_line": 261,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.UpperBoundMapper.boundedToUnbounded(double)",
      "begin_line": 266,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LowerUpperBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 273,
      "end_line": 300,
      "comment": " Local class for lower and bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "boundingFunction"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " Function from unbounded to bounded. "
    },
    {
      "type": "field",
      "varNames": [
        "unboundingFunction"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " Function from bounded to unbounded. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper.LowerUpperBoundMapper(double, double)",
      "begin_line": 285,
      "end_line": 288,
      "comment": " Simple constructor.\n         * @param lower lower bound\n         * @param upper upper bound\n         ",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 59)",
        "(line 287,col 13)-(line 287,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper.unboundedToBounded(double)",
      "begin_line": 291,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper.boundedToUnbounded(double)",
      "begin_line": 296,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 13)-(line 297,col 47)"
      ]
    }
  ]
}