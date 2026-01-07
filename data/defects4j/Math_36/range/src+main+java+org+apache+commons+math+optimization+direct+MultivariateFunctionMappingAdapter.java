{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/optimization/direct/MultivariateFunctionMappingAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateFunctionMappingAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.MultivariateFunction"
      ],
      "begin_line": 78,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bounded"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Underlying bounded function. "
    },
    {
      "type": "field",
      "varNames": [
        "mappers"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Mapping functions. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.MultivariateFunctionMappingAdapter(org.apache.commons.math.analysis.MultivariateFunction, double[], double[])",
      "begin_line": 97,
      "end_line": 135,
      "comment": " Simple constructor.\n     * @param bounded bounded function\n     * @param lower lower bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.NEGATIVE_INFINITY} for\n     * unbounded values)\n     * @param upper upper bounds for each element of the input parameters array\n     * (some elements may be set to {@code Double.POSITIVE_INFINITY} for\n     * unbounded values)\n     * @exception DimensionMismatchException if lower and upper bounds are not\n     * consistent, either according to dimension or to values\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 102,col 38)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 31)",
        "(line 114,col 9)-(line 114,col 48)",
        "(line 115,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.unboundedToBounded(double[])",
      "begin_line": 141,
      "end_line": 151,
      "comment": " Map an array from unbounded to bounded.\n     * @param point unbounded value\n     * @return bounded value\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 59)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.boundedToUnbounded(double[])",
      "begin_line": 157,
      "end_line": 167,
      "comment": " Map an array from bounded to unbounded.\n     * @param point bounded value\n     * @return unbounded value\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 59)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.value(double[])",
      "begin_line": 179,
      "end_line": 181,
      "comment": " Compute the underlying function value from an unbounded point.\n     * \u003cp\u003e\n     * This method simply bounds the unbounded point using the mappings\n     * set up at construction and calls the underlying function using\n     * the bounded point.\n     * \u003c/p\u003e\n     * @param point unbounded value\n     * @return underlying function value\n     * @see #unboundedToBounded(double[])\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Mapper",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 184,
      "end_line": 198,
      "comment": " Mapping interface. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.Mapper.unboundedToBounded(double)",
      "begin_line": 190,
      "end_line": 190,
      "comment": " Map a value from unbounded to bounded.\n         * @param y unbounded value\n         * @return bounded value\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.Mapper.boundedToUnbounded(double)",
      "begin_line": 196,
      "end_line": 196,
      "comment": " Map a value from bounded to unbounded.\n         * @param x bounded value\n         * @return unbounded value\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NoBoundsMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 201,
      "end_line": 218,
      "comment": " Local class for no bounds mapping. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.NoBoundsMapper.NoBoundsMapper()",
      "begin_line": 205,
      "end_line": 206,
      "comment": " Simple constructor.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.NoBoundsMapper.unboundedToBounded(double)",
      "begin_line": 209,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 13)-(line 210,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.NoBoundsMapper.boundedToUnbounded(double)",
      "begin_line": 214,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LowerBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 221,
      "end_line": 243,
      "comment": " Local class for lower bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": " Low bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.LowerBoundMapper.LowerBoundMapper(double)",
      "begin_line": 229,
      "end_line": 231,
      "comment": " Simple constructor.\n         * @param lower lower bound\n         ",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.LowerBoundMapper.unboundedToBounded(double)",
      "begin_line": 234,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.LowerBoundMapper.boundedToUnbounded(double)",
      "begin_line": 239,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UpperBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 246,
      "end_line": 268,
      "comment": " Local class for upper bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " Upper bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.UpperBoundMapper.UpperBoundMapper(double)",
      "begin_line": 254,
      "end_line": 256,
      "comment": " Simple constructor.\n         * @param upper upper bound\n         ",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.UpperBoundMapper.unboundedToBounded(double)",
      "begin_line": 259,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.UpperBoundMapper.boundedToUnbounded(double)",
      "begin_line": 264,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LowerUpperBoundMapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.Mapper"
      ],
      "begin_line": 271,
      "end_line": 298,
      "comment": " Local class for lower and bounds mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "boundingFunction"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " Function from unbounded to bounded. "
    },
    {
      "type": "field",
      "varNames": [
        "unboundingFunction"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " Function from bounded to unbounded. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper.LowerUpperBoundMapper(double, double)",
      "begin_line": 283,
      "end_line": 286,
      "comment": " Simple constructor.\n         * @param lower lower bound\n         * @param upper upper bound\n         ",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 59)",
        "(line 285,col 13)-(line 285,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper.unboundedToBounded(double)",
      "begin_line": 289,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 13)-(line 290,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.LowerUpperBoundMapper.boundedToUnbounded(double)",
      "begin_line": 294,
      "end_line": 296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 13)-(line 295,col 47)"
      ]
    }
  ]
}