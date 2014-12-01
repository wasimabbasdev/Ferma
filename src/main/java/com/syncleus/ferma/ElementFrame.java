/******************************************************************************
 *                                                                             *
 *  Copyright: (c) Syncleus, Inc.                                              *
 *                                                                             *
 *  You may redistribute and modify this source code under the terms and       *
 *  conditions of the Open Source Community License - Type C version 1.0       *
 *  or any later version as published by Syncleus, Inc. at www.syncleus.com.   *
 *  There should be a copy of the license included with this file. If a copy   *
 *  of the license is not included you are granted no right to distribute or   *
 *  otherwise use this file except through a legal and valid license. You      *
 *  should also contact Syncleus, Inc. at the information below if you cannot  *
 *  find a license:                                                            *
 *                                                                             *
 *  Syncleus, Inc.                                                             *
 *  2604 South 12th Street                                                     *
 *  Philadelphia, PA 19148                                                     *
 *                                                                             *
 ******************************************************************************/
package com.syncleus.ferma;

import com.tinkerpop.blueprints.Element;

import java.util.Set;

public interface ElementFrame {
    /**
     * @return The id of this element.
     */
    public <N> N getId();

    /**
     * @return The property keys of this element.
     */
    public Set<String> getPropertyKeys();

    /**
     * Remove this element from the graph.
     */
    public void remove();

    /**
     * @return The underlying element.
     */
    public Element element();

    /**
     * @return The underlying graph.
     */
    public FramedGraph graph();

    /**
     * Return a property value.
     *
     * @param name
     *            The name of the property.
     * @return the value of the property or null if none was present.
     */
    public <T> T getProperty(String name);

    /**
     * Return a property value.
     *
     * @param name
     *            The name of the property.
     * @param type
     *            The type of the property.
     *
     * @return the value of the property or null if none was present.
     */
    public <T> T getProperty(String name, Class<T> type);

    /**
     * Set a property value.
     *
     * @param name
     *            The name of the property.
     * @param value
     *            The value of the property.
     */
    public void setProperty(String name, Object value);

    /**
     * Returns the type resolution currently encoded into the element.
     *
     * @return the current type resolution.
     * @since 2.1.0
     */
    public Class<?> getTypeResolution();

    /**
     * Sets the type resolution and encodes it into the element in the graph.
     *
     * @param type The new type to resolve this element to.
     * @since 2.1.0
     */
    public void setTypeResolution(Class<?> type);

    /**
     * Removes type resolution from this node and decodes it from the element in the graph.
     *
     * @since 2.1.0
     */
    public void removeTypeResolution();

    /**
     * Query over all vertices in the graph.
     *
     * @return The query.
     */
    public VertexTraversal<?, ?, ?> v();

    /**
     * Query over all edges in the graph.
     *
     * @return The query.
     */
    public EdgeTraversal<?, ?, ?> e();

    /**
     * Query over a list of vertices in the graph.
     *
     * @param ids
     *            The ids of the vertices.
     * @return The query.
     */
    public VertexTraversal<?, ?, ?> v(final Object... ids);

    /**
     * Query over a list of edges in the graph.
     *
     * @param ids
     *            The ids of the edges.
     * @return The query.
     */
    public EdgeTraversal<?, ?, ?> e(final Object... ids);
}