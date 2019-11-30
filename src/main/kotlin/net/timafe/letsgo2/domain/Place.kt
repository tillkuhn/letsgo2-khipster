package net.timafe.letsgo2.domain

import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import java.io.Serializable
import java.time.Instant

/**
 * A Place.
 */
@Entity
@Table(name = "place")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
class Place(

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    var id: Long? = null,

    @get: NotNull
    @Column(name = "name", nullable = false)
    var name: String? = null,

    @Column(name = "summary")
    var summary: String? = null,

    @Column(name = "image_url")
    var imageUrl: String? = null,

    @Column(name = "rating")
    var rating: Int? = null,

    @Column(name = "lotype")
    var lotype: String? = null,

    @Column(name = "country")
    var country: String? = null,

    @Column(name = "updated_by")
    var updatedBy: String? = null,

    @Column(name = "coordinates")
    var coordinates: String? = null,

    @Column(name = "notes")
    var notes: String? = null,

    @Column(name = "updated_at")
    var updatedAt: Instant? = null,

    @Column(name = "primary_url")
    var primaryUrl: String? = null

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
) : Serializable {
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Place) return false
        if (other.id == null || id == null) return false

        return id == other.id
    }

    override fun hashCode() = 31

    override fun toString() = "Place{" +
        "id=$id" +
        ", name='$name'" +
        ", summary='$summary'" +
        ", imageUrl='$imageUrl'" +
        ", rating=$rating" +
        ", lotype='$lotype'" +
        ", country='$country'" +
        ", updatedBy='$updatedBy'" +
        ", coordinates='$coordinates'" +
        ", notes='$notes'" +
        ", updatedAt='$updatedAt'" +
        ", primaryUrl='$primaryUrl'" +
        "}"


    companion object {
        private const val serialVersionUID = 1L
    }
}
