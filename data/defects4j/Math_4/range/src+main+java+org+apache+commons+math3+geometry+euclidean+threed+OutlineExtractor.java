{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/OutlineExtractor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OutlineExtractor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 258,
      "comment": " Extractor for {@link PolygonsSet polyhedrons sets} outlines.\n * \u003cp\u003eThis class extracts the 2D outlines from {{@link PolygonsSet\n * polyhedrons sets} in a specified projection plane.\u003c/p\u003e\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "u"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Abscissa axis of the projection plane. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Ordinate axis of the projection plane. "
    },
    {
      "type": "field",
      "varNames": [
        "w"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Normal of the projection plane (viewing direction). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.OutlineExtractor.OutlineExtractor(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 53,
      "end_line": 57,
      "comment": " Build an extractor for a specific projection plane.\n     * @param u abscissa axis of the projection point\n     * @param v ordinate axis of the projection point\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 19)",
        "(line 55,col 9)-(line 55,col 19)",
        "(line 56,col 9)-(line 56,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.OutlineExtractor.getOutline(org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet)",
      "begin_line": 63,
      "end_line": 97,
      "comment": " Extract the outline of a polyhedrons set.\n     * @param polyhedronsSet polyhedrons set whose outline must be extracted\n     * @return an outline, as an array of loops.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 68)",
        "(line 67,col 9)-(line 67,col 54)",
        "(line 68,col 9)-(line 68,col 63)",
        "(line 71,col 9)-(line 71,col 61)",
        "(line 72,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.OutlineExtractor.pointIsBetween(org.apache.commons.math3.geometry.euclidean.twod.Vector2D[], int, int)",
      "begin_line": 107,
      "end_line": 119,
      "comment": " Check if a point is geometrically between its neighbour in an array.\n     * \u003cp\u003eThe neighbours are computed considering the array is a loop\n     * (i.e. point at index (n-1) is before point at index 0)\u003c/p\u003e\n     * @param loop points array\n     * @param n number of points to consider in the array\n     * @param i index of the point to check (must be between 0 and n-1)\n     * @return true if the point is exactly between its neighbours\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 56)",
        "(line 109,col 9)-(line 109,col 42)",
        "(line 110,col 9)-(line 110,col 52)",
        "(line 111,col 9)-(line 111,col 66)",
        "(line 112,col 9)-(line 112,col 66)",
        "(line 113,col 9)-(line 113,col 65)",
        "(line 114,col 9)-(line 114,col 65)",
        "(line 115,col 9)-(line 115,col 55)",
        "(line 116,col 9)-(line 116,col 55)",
        "(line 117,col 9)-(line 117,col 98)",
        "(line 118,col 9)-(line 118,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundaryProjector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e"
      ],
      "begin_line": 122,
      "end_line": 256,
      "comment": " Visitor projecting the boundary facets on a plane. "
    },
    {
      "type": "field",
      "varNames": [
        "projected"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Projection of the polyhedrons set on the plane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.OutlineExtractor.BoundaryProjector.BoundaryProjector()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.OutlineExtractor.BoundaryProjector.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 134,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.OutlineExtractor.BoundaryProjector.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 139,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 13)-(line 142,col 69)",
        "(line 143,col 13)-(line 145,col 13)",
        "(line 146,col 13)-(line 148,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.OutlineExtractor.BoundaryProjector.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 152,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.OutlineExtractor.BoundaryProjector.addContribution(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, boolean)",
      "begin_line": 159,
      "end_line": 247,
      "comment": " Add he contribution of a boundary facet.\n         * @param facet boundary facet\n         * @param reversed if true, the facet has the inside on its plus side\n         ",
      "child_ranges": [
        "(line 162,col 13)-(line 164,col 72)",
        "(line 165,col 13)-(line 165,col 65)",
        "(line 167,col 13)-(line 167,col 64)",
        "(line 168,col 13)-(line 246,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.OutlineExtractor.BoundaryProjector.getProjected()",
      "begin_line": 252,
      "end_line": 254,
      "comment": " Get the projection of the polyhedrons set on the plane.\n         * @return projection of the polyhedrons set on the plane\n         ",
      "child_ranges": [
        "(line 253,col 13)-(line 253,col 29)"
      ]
    }
  ]
}