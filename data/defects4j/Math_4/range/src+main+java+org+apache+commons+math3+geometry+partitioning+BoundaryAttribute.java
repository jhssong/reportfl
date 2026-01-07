{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/BoundaryAttribute.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoundaryAttribute",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 84,
      "comment": " Class holding boundary attributes.\n * \u003cp\u003eThis class is used for the attributes associated with the\n * nodes of region boundary shell trees returned by the {@link\n * Region#getTree Region.getTree}. It contains the\n * parts of the node cut sub-hyperplane that belong to the\n * boundary.\u003c/p\u003e\n * \u003cp\u003eThis class is a simple placeholder, it does not provide any\n * processing methods.\u003c/p\u003e\n * @param \u003cS\u003e Type of the space.\n * @see Region#getTree\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "plusOutside"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Part of the node cut sub-hyperplane that belongs to the\n     * boundary and has the outside of the region on the plus side of\n     * its underlying hyperplane (may be null).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "plusInside"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Part of the node cut sub-hyperplane that belongs to the\n     * boundary and has the inside of the region on the plus side of\n     * its underlying hyperplane (may be null).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.BoundaryAttribute.BoundaryAttribute(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 56,
      "end_line": 60,
      "comment": " Simple constructor.\n     * @param plusOutside part of the node cut sub-hyperplane that\n     * belongs to the boundary and has the outside of the region on\n     * the plus side of its underlying hyperplane (may be null)\n     * @param plusInside part of the node cut sub-hyperplane that\n     * belongs to the boundary and has the inside of the region on the\n     * plus side of its underlying hyperplane (may be null)\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 39)",
        "(line 59,col 9)-(line 59,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BoundaryAttribute.getPlusOutside()",
      "begin_line": 69,
      "end_line": 71,
      "comment": " Get the part of the node cut sub-hyperplane that belongs to the\n     * boundary and has the outside of the region on the plus side of\n     * its underlying hyperplane.\n     * @return part of the node cut sub-hyperplane that belongs to the\n     * boundary and has the outside of the region on the plus side of\n     * its underlying hyperplane\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BoundaryAttribute.getPlusInside()",
      "begin_line": 80,
      "end_line": 82,
      "comment": " Get the part of the node cut sub-hyperplane that belongs to the\n     * boundary and has the inside of the region on the plus side of\n     * its underlying hyperplane.\n     * @return part of the node cut sub-hyperplane that belongs to the\n     * boundary and has the inside of the region on the plus side of\n     * its underlying hyperplane\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 26)"
      ]
    }
  ]
}